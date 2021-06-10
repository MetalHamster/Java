package sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPServer {

    public static void main(String[] args){
        String data="";
        byte[] dataByte;
        byte[] buffer= new byte[256];
        DatagramSocket udpSocket;
        DatagramPacket datagramPacket;

        try {
            udpSocket = new DatagramSocket(1650);
            datagramPacket = new DatagramPacket(buffer,buffer.length);

            do
            try
            {
                udpSocket.receive(datagramPacket);
                dataByte = Arrays.copyOf(datagramPacket.getData(),datagramPacket.getLength());
                data = Arrays.toString(dataByte);
                String dataString = new String(dataByte);
                System.out.println(data);
                System.out.println(dataString);
            } catch (IOException e) {
                e.printStackTrace();
            }
            while(!"end".equalsIgnoreCase(data));

        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
