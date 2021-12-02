
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CaoTrung
 */
public class MulticastImageSender {

    private static final int TIMEOUT = 3000;
    private static final int MAXFILELEN = 65000;

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length < 4) // Test for correct # of args
        {
            throw new IllegalArgumentException("Parameter(s): <Multicast Address> <Port> <TTL> <Image File>[<Image File>...]");
        }
        InetAddress multicastAddress = InetAddress.getByName(args[0]);
        int destPort = Integer.parseInt(args[1]);
        int TTL = Integer.parseInt(args[2]);
        MulticastSocket socket = new MulticastSocket();
        socket.setTimeToLive(TTL);
        for (int i = 3; i < args.length; i++) {
            RandomAccessFile file = new RandomAccessFile(args[i], "r");
            if (file.length() > MAXFILELEN) {
                throw new IOException("File too big");
            }
            byte[] fileBuffer = new byte[(int) file.length()];
            file.read(fileBuffer);
            file.close();
            // Create a datagram to send
            DatagramPacket sendPacket = new DatagramPacket(fileBuffer,
                    fileBuffer.length, multicastAddress, destPort);
            socket.send(sendPacket); // Send the echo string
            System.out.println("Sent " + args[i] + " to " + sendPacket.getAddress().getHostAddress() + " on port " + sendPacket.getPort());
            Thread.sleep(TIMEOUT);
        }
        socket.close();
    }
}
