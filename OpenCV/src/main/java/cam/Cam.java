package cam;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Cam implements ObservableCam, Runnable{
    private List<ObserverCam> observerCams = new ArrayList<>();
    private Mat matrix;
    private BufferedImage bfImage;
    private WritableRaster raster;
    private DataBufferByte dataBuffer;
    private VideoCapture capture;

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);     // Load the native library.
    }

    public Cam(ObserverCam observerCam){
        addSubscriber(observerCam);
        capture = new VideoCapture(1);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.MILLISECONDS);
    }
    
    public Cam(ObserverCam observerCam, int camera, int delayInMilliSec, int intervalInMilliSec){
        addSubscriber(observerCam);
        capture = new VideoCapture(camera);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, delayInMilliSec, intervalInMilliSec, TimeUnit.MILLISECONDS);
    }

    public Image captureCamFX(){
        // Create new Matrix
        matrix = new Mat();
        // Reading the next video frame from the camera to matrix
        capture.read(matrix);
        // Close camera
        //capture.release();

        bfImage = new BufferedImage(matrix.width(),matrix.height(),BufferedImage.TYPE_3BYTE_BGR);

        raster = bfImage.getRaster();
        dataBuffer = (DataBufferByte) raster.getDataBuffer();
        byte[] data = dataBuffer.getData();
        matrix.get(0, 0, data);

        //Back surface 640x480
        //Front(webcam) 640x480
        //System.out.println(bfImage.getHeight());
        //System.out.println(bfImage.getWidth());

        return SwingFXUtils.toFXImage(bfImage,null);
    }

    @Override
    public void addSubscriber(ObserverCam observerCam) {
        observerCams.add(observerCam);
    }

    @Override
    public void removeSubscriber(ObserverCam observerCam) {
        observerCams.remove(observerCam);
    }

    @Override
    public void notifySubscribers() {
        observerCams.forEach(observerCams -> observerCams.update(captureCamFX()));
    }

    @Override
    public void run() {
        notifySubscribers();
    }
}
