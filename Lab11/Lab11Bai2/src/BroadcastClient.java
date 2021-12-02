
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CaoTrung
 */
public class BroadcastClient {

    public static final int PORT = 1200;

    public static void main(String args[]) throws Exception {
        MulticastSocket socket;
        DatagramPacket packet;
        InetAddress address;
        address = InetAddress.getByName(args[0]);
        socket = new MulticastSocket(BroadcastServer.PORT);
//join a Multicast group and send the group salutations
        socket.joinGroup(address);
        byte[] data = null;
        packet = new DatagramPacket(data, data.length);
        for (;;) {
// receive the packets
            socket.receive(packet);
            String str = new String(packet.getData());
            System.out.println(" Time signal recieved from"
                    + packet.getAddress() + " Time is : " + str);
        } // for
    }
}
