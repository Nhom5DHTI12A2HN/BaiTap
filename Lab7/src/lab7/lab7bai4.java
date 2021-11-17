/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author LENOVO
 */
public class lab7bai4 {

    public static void main(String[] args) throws Exception {
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = (NetworkInterface) interfaces.nextElement();
            System.out.println(ni);
        }
    }
}
