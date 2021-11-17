/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author LENOVO
 */
public class lab7bai6 {

    public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets
                = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            displayInterfaceInformation(netint);
        }
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws
            SocketException {
        System.out.printf("Display name: %s \n", netint.getDisplayName());
        System.out.printf("Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            System.out.printf("InetAddress: %s\n", inetAddress);
        }
        System.out.printf("Up? %s\n", netint.isUp());
        System.out.printf("Loopback? %s\n", netint.isLoopback());
        System.out.printf("PointToPoint? %s\n", netint.isPointToPoint());
        System.out.printf("Supports multicast? %s\n", netint.supportsMulticast());
        System.out.printf("Virtual? %s\n", netint.isVirtual());
        System.out.printf("Hardware address: %s\n",Arrays.toString(netint.getHardwareAddress()));
        System.out.printf("MTU: %s\n", netint.getMTU());
        System.out.printf("\n");
    }
}


