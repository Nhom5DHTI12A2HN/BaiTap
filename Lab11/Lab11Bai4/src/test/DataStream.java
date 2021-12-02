/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/**
 *
 * @author CaoTrung
 */
public class DataStream extends Thread{
    byte[] receive;
    MulticastSocket multiSocket;

    public DataStream(Server server) {
        this.multiSocket = server.multiSocket;
        start();
    }

    @Override
    public void run() {
        while (true) {
            receive = new byte[256];
            DatagramPacket packet = new DatagramPacket(receive, receive.length);
            try {
                multiSocket.receive(packet);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Da nhan : "+new String(packet.getData()).trim());
        }
    }
}
