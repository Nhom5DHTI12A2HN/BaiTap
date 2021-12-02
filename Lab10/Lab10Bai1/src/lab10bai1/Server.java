/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10bai1;

import java.net.*;
import java.io.*;

/**
 *
 * @author CaoTrung
 */
public class Server {

    public static void main(String argv[]) throws IOException {
        try {
            DatagramSocket s = new DatagramSocket(1234);
            System.out.println(" Lắng nghe..");
            while (true) {
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                s.receive(packet);
                String message = new String(packet.getData(), 0, 0, packet.getLength());
                System.out.println("Tín hiệu từ " + packet.getAddress().getHostName() + "- " + message);
            }
        } catch (Exception e) {
        }
    }
}
