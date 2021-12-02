/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testt;

import java.net.*;

/**
 *
 * @author CaoTrung
 */
public class MuticastChatServer {

    public static void main(String args[]) {
        try {
            DatagramSocket ds = new DatagramSocket(7);
            System.out.println("Da tao xong socket");
            byte[] buffer = new byte[60000];
            while (true) {
                DatagramPacket in = new DatagramPacket(buffer, buffer.length);
                ds.receive(in);

                String str = new String(in.getData(), 0, in.getLength());

                DatagramPacket out = new DatagramPacket(str.getBytes(), in.getLength(), in.getAddress(), in.getPort());
                ds.send(out);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
