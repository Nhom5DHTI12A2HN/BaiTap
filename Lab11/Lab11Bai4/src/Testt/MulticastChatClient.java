/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testt;
import java.net.*;
import java.io.*;

/**
 *
 * @author CaoTrung
 */
public class MulticastChatClient {
    public final static int serverPort = 7;
    public static void main(String args[]){
        try {
            if (args.length == 0) {
                System.out.println("Host name");
                return;
            }
            DatagramSocket ds = new DatagramSocket();
            InetAddress server = InetAddress.getByName(args[0]);
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String theString = br.readLine();
                byte[] data = theString.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, server, serverPort);
                ds.send(dp);
                byte[] buffer = new byte[6000];
                
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming);
                
                System.out.println(new String(incoming.getData(), 0, incoming.getLength()));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
