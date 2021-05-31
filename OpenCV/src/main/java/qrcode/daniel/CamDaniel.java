package qrcode.daniel;

import com.google.zxing.NotFoundException;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import qrcode.QrFunctions;
import utils.OpenCVUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CamDaniel implements Runnable, Observable {
    public VideoCapture video;
    ImgListener imgListener;
    Map map;
    String qrWorld;
    List<InvalidationListener> listeners;
    public CamDaniel(ImgListener imgListener) {
        this.imgListener = imgListener;
        map = new HashMap();
        listeners = new ArrayList<>();
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);          // Load the native library.
        video = new VideoCapture(0);                        // Open video stream on the front-camera "index:0"

        if (video.isOpened()) {
            Mat mat = new Mat();  //initialize mat class /is for storing the picture
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                video.read(mat);

                if (!mat.empty()) {
                    imgListener.changeImage(OpenCVUtils.mat2Img(mat));    //changing the image
                    saveImage(mat);                                  //saves the newest picture of the video
                } else {
                    System.out.println(" --(!) No captured frame -- Break!");
                    break;
                }

                try {
                    System.out.println(QrFunctions.readQRCode("./camera.jpg","UTF-8",map));    //reads the QRcode in the picture and writes it ou tin the cmd
                    qrWorld=QrFunctions.readQRCode("./camera.jpg","UTF-8",map);
                    inform();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NotFoundException e) {
                    System.out.println("no QR-code found!");    //if there is no QRcode this catch gets called
                    qrWorld="no QR-code found!";
                }

            }
        }
        video.release();
    }
    public String getQrWorld() {
        return qrWorld;
    }
    public void saveImage(Mat mat) {
        // Saving the Image
        String file = "./camera.jpg";
        // Instantiating the imgcodecs class
        Imgcodecs imageCodecs = new Imgcodecs();
        // Saving it again
        imageCodecs.imwrite(file, mat);
    }
    @Override
    public void addListener(InvalidationListener listener) {
        listeners.add(listener);
    }
    @Override
    public void removeListener(InvalidationListener listener) {
        listeners.remove(listener);
    }
    public void inform()
    {
        for( InvalidationListener o: listeners)                   // the methode invalidated() of every InvalidationListener in the list
        {
            o.invalidated(this);
        }
    }
}