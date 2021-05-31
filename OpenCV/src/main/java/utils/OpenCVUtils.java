package utils;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class OpenCVUtils
{
    static
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);     // Load the native library. 
    }

    /*
    public static Image mat2Img(Mat mat)
    {
        MatOfByte bytes = new MatOfByte();
        Imgcodecs.imencode("jpg", mat, bytes);
        return new Image(new ByteArrayInputStream(bytes.toArray()));
    }*/
    /**
     * Convert a Mat object (OpenCV) in the corresponding Image for JavaFX
     *
     * @param frame the {@link Mat} representing the current frame
     * @return the {@link Image} to show
     */
    public static Image mat2Img(Mat frame)
    {
        try
        {
            return SwingFXUtils.toFXImage(matToBufferedImage(frame), null);
        } catch (Exception e)
        {
            System.err.println("Cannot convert the Mat obejct: " + e);
            return null;
        }
    }


    public static BufferedImage matToBufferedImage(Mat original)
    {
        // init
        BufferedImage image;
        int width = original.width(), height = original.height(), channels = original.channels();
        byte[] sourcePixels = new byte[width * height * channels];
        original.get(0, 0, sourcePixels);

        if (original.channels() > 1)
        {
            image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        } else
        {
            image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        }
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(sourcePixels, 0, targetPixels, 0, sourcePixels.length);

        return image;
    }

    public static Mat captureImage(int camera){
        // Start camera
        VideoCapture capture = new VideoCapture(camera);
        // Create new Matrix
        Mat matrix = new Mat();
        // Reading the next video frame from the camera to matrix
        capture.read(matrix);
        // Close camera
        //capture.release();
        return matrix;
    }

    public static Image captureFXImage(int camera){
        // Start camera
        VideoCapture capture = new VideoCapture(camera);
        // Create new Matrix
        Mat matrix = new Mat();
        // Reading the next video frame from the camera to matrix
        capture.read(matrix);
        // Close camera
        //capture.release();

        BufferedImage bfImage = new BufferedImage(matrix.width(),matrix.height(),BufferedImage.TYPE_3BYTE_BGR);

        WritableRaster raster = bfImage.getRaster();
        DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
        byte[] data = dataBuffer.getData();
        matrix.get(0, 0, data);

        return SwingFXUtils.toFXImage(bfImage,null);

    }
}