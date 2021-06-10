package sockets;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class HttpsRequest {
    public static void main(String[] args) throws IOException {
        String httpsUrl ="https://www.hftm.ch";
        URL url;

        url = new URL(httpsUrl);
        HttpsURLConnection httpsCon = (HttpsURLConnection) url.openConnection();
        InputStream inputStream = httpsCon.getInputStream();

        // read and writeout the response
        int len;
        byte[] b = new byte[4096];
        while ((len = inputStream.read(b)) != -1)
        {
            System.out.write(b, 0, len);
        }
        // end program
        inputStream.close();
    }
}
