package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class HttpRequest
{
    public static void main(String[] args) throws IOException
    {
        String host = "www.alainrohr.ch";
        // initialisation
        Socket socket = new Socket(InetAddress.getByName(host), 80);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        InputStream in = socket.getInputStream();

        // send an HTTP request to the web server
        out.println("GET / HTTP/1.1\r\nHost:"+host+"\r\n");
        // read and writeout the response
        int len;
        byte[] b = new byte[4096];
        while ((len = in.read(b)) != -1)
        {
            System.out.write(b, 0, len);
        }
        // end program
        in.close();
        out.close();
        socket.close();
    }
}