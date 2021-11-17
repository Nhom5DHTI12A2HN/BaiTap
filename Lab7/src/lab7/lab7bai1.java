/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LENOVO
 */
public class lab7bai1 {

    public static void main(String args[]) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hello. My name is "
                    + address.getHostName() + " and my IP adress is "
                    + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("I don't know my own name and address.");
        }
    }
}

