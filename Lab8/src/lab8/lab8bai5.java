/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LENOVO
 */
public class lab8bai5 {

    public final static int echoPort = 7;

    public static void main(String[] args) {
        ServerSocket theServerSocket;
        Socket theConnectionSocket;
        BufferedReader in;
        PrintWriter out;
        try {
            theServerSocket = new ServerSocket(echoPort);
            System.out.println("EchoServer ready at port " + echoPort);
            while (true) {
                theConnectionSocket = theServerSocket.accept();
                try {
                    System.out.println("Request arrived!");
                    in = new BufferedReader(new InputStreamReader(theConnectionSocket.getInputStream()));
                    out = new PrintWriter(theConnectionSocket.getOutputStream(), true);
                    while (true) {
                        String readText = in.readLine();
                        out.println(readText);
                    }
                } catch (IOException e) {
                    theConnectionSocket.close();
                }
            }
        } catch (IOException e) {
            InterruptedException(e);
        }
    }
}

