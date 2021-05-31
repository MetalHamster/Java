package qrcode;

import com.google.zxing.EncodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import utils.OpenCVUtils;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void test(Map hintMap){
        while (true) {
            try {
                System.out.println(QrFunctions.getQRCode(hintMap, OpenCVUtils.matToBufferedImage(OpenCVUtils.captureImage(0))));
                Thread.sleep(10);
            } catch (IOException | NotFoundException | InterruptedException e) {
                System.out.println("QR not found"+e);
                //test(hintMap);
            }
        }
    }
    public static void main(String[] args) throws NotFoundException{
        Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<>();
        test(hintMap);
        //System.out.println(QrFunctions.readQRCode("OpenCV/src/main/java/qrcode/test.png","UTF-8", hintMap));

    }
}
