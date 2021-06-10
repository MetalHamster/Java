package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer{
        public static void main(String[] args) throws IOException
        {
            ServerSocket server = new ServerSocket(5001); // listening on port
            Socket client = server.accept(); // blocked until connection
            InputStream input = client.getInputStream(); // input channel
            byte buf[] = new byte[128]; // prepare receive buffer
            int len = 0;
            while (true) // servers run forever
            {
                len = input.read(buf); // read from stream and count bytes
                byte[] data = Arrays.copyOf(buf, len); // cut relevant bytes
                String output = Arrays.toString(data); // prepare for nice output
                System.out.println(output); // output
            }
        }
}
