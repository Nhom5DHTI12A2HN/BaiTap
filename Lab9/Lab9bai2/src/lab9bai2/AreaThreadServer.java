/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9bai2;
import java.io.*;
import java.net.*;
/**
 *
 * @author CaoTrung
 */
public class AreaThreadServer {
    public static void main(String[] args) {
        //Khai bao bien
        int count;
        ServerSocket svr = null;
        Socket cl = null;
        int portServer = 3456;
        try {
            svr = new ServerSocket(portServer);
            count = 0;
            while (true) {
                cl = svr.accept();
                new NewThread(cl, count);
                count++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
