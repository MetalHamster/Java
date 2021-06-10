package sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

        public static void main(String[] args) throws IOException
        {
            Scanner scanner = new Scanner(System.in);
            Socket client = new Socket("localhost", 5000); // connect to server
            OutputStream output = client.getOutputStream(); // output channel
            while(true)
            {
                System.out.print("entry:");
                byte entry = scanner.nextByte(); // input byte from user
                output.write(entry); // write to stream
                output.flush(); // flush stream
                if(entry==0)break; // possibility to cancel
            }
            output.close(); // close stream channel
            client.close(); // close socket
        }

}
