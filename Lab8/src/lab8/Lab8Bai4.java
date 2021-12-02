/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Lab8Bai4 {

    public final static int daytimePort = 13;

    public static void main(String[] args) {
        ServerSocket theServerSocket;
        Socket theConnectionSocket;
        PrintWriter out;
        try {
            theServerSocket = new ServerSocket(daytimePort);
            System.out.println("TimeServer ready at port " + daytimePort);
            try {
                while (true) {
                    theConnectionSocket = theServerSocket.accept();
                    System.out.println("Request arrived!");
                    out = new PrintWriter(theConnectionSocket.getOutputStream(), true);
                    out.println(new Date());
                    theConnectionSocket.close();
                }
            } catch (IOException e) {
                theServerSocket.close();
            }
        } catch (IOException e) {
        }
    }
}
