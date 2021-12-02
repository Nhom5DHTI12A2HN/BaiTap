/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author CaoTrung
 */
public class Server {
    static MulticastSocket socket;
    static DatagramPacket packet;
    static DatagramPacket packet1;
    static InetAddress address;
    static final int port=5000;
    public static void main(String[] args) throws IOException
    {
        System.out.println("Server starting.................");
        while(true)
        {
            byte[] temp=new byte[1000];
            socket=new MulticastSocket(port);
            packet=new DatagramPacket(temp, temp.length);
            address=InetAddress.getByName("224.2.2.2");
            socket.joinGroup(address);

            socket.receive(packet);
            String str=new String(packet.getData(),0,temp.length);
            System.out.println("Chuoi nhan tu client:  "+str);

            //dong goi va gui chuoi ve server//
            packet1=new DatagramPacket(str.getBytes(),str.length(),packet.getAddress(),packet.getPort());
            socket.send(packet1);
        }
    }
}
