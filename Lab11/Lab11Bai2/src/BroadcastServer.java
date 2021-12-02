
import java.net.*;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CaoTrung
 */
public class BroadcastServer {

    public static final int PORT = 1200;

    public static void main(String args[]) throws Exception {
        MulticastSocket socket;
        DatagramPacket packet;
        InetAddress address;
        address = InetAddress.getByName(args[0]);
        socket = new MulticastSocket();
// join a Multicast group and send the group salutations
        socket.joinGroup(address);
        byte[] data = null;
        for (;;) {
            Thread.sleep(1000);
            System.out.println("Sending ");
            String str = (new Date()).toString();
            data = str.getBytes();
            packet = new DatagramPacket(data, str.length(), address, PORT);
// Sends the packet
            socket.send(packet);
        } // for
    }
}
