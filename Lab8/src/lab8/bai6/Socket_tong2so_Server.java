/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.bai6;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LENOVO
 */
public class Socket_tong2so_Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server dang khoi dong... ");
        String so1, so2, so3;
        int tong;
        // tao Server socket 
        ServerSocket Server = new ServerSocket(1234);
        System.out.println("Server da san sang! ");
        //tao 1 socket do ket noi tu Client toi Server
        Socket connectionSocket = Server.accept();
        //tao luong nhan du lieu tu Client
        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
        // tao luong gui du lieu toi Client
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        // truyen du lieu tu Client vao 2 bien so1 va so2 
        so1 = inFromClient.readLine();
        so2 = inFromClient.readLine();
        //ep so1 va so2 tu kieu String sang kieu Integer
        int a = Integer.parseInt(so1);
        int b = Integer.parseInt(so2);
        //tinh tong a + b 
        tong = a + b;
        //ep tong sang kieu String
        so3 = String.valueOf(tong);
        //gui so3 ve Client
         outToClient.writeBytes(so3 + '\n');
        //dong luong nhan du lieu tu Client
         inFromClient.close();
        //dong luong gui du lieu ve Client
         outToClient.close();
        //dong Server socket 
        Server.close();
    }
}
