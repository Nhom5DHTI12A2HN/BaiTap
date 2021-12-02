/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

/**
 *
 * @author CaoTrung
 */
public class Server {

    MulticastSocket multiSocket;
    InetAddress ip;

    public void runServer() {
        try {
            multiSocket = new MulticastSocket(8080);
            InetAddress ip = InetAddress.getByName("225.225.225.225");
            multiSocket.joinGroup(ip);
            DataStream das = new DataStream(this);
            byte[] send;
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Nhap chuoi : ");
                send = new byte[256];
                send = input.nextLine().getBytes();
                DatagramPacket sendPacket = new DatagramPacket(send,
                        send.length, ip, 8080);
                multiSocket.send(sendPacket);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        new Server().runServer();
    }
}
