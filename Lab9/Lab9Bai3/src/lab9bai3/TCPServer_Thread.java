/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author CaoTrung
 */
public class TCPServer_Thread {

    ServerSocket mServer;
    JTextArea mTxaStatus; //JTextArea để lưu status của Server

    public TCPServer_Thread(JTextArea txaStatus) {
        mTxaStatus = txaStatus;
    }

    TCPServer_Thread(JScrollPane txaStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        try {
            String so1, so2, so3, so4, so5, so6;
            int tong, hieu, thuong, tich;
            mServer = new ServerSocket(1234);
            mTxaStatus.append("Server đã sẵn sàng!\nĐang chờ dữ liệu...\n\n");
            while (true) {
                Socket connectionSocket = mServer.accept();
                DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                so1 = inFromClient.readLine();
                so2 = inFromClient.readLine();
                mTxaStatus.append("Đã nhận 2 số a = " + so1 + ", b = " + so2 + "\n");
                int a = Integer.parseInt(so1);
                int b = Integer.parseInt(so2);
                tong = a + b;
                so3 = String.valueOf(tong);
                mTxaStatus.append("Thực hiện phép tính a + b\n");
                outToClient.writeBytes(so3 + '\n');

                /*hieu = a - b;
                so3 = String.valueOf(hieu);
                mTxaStatus.append("Thực hiện phép tính a - b\n");
                outToClient.writeBytes(so3+'\n');
                
                tich = a * b;
                so3 = String.valueOf(tich);
                mTxaStatus.append("Thực hiện phép tính a * b\n");
                outToClient.writeBytes(so3+'\n');
                
                thuong = a / b;
                so3 = String.valueOf(thuong);
                mTxaStatus.append("Thực hiện phép tính a / b\n");
                outToClient.writeBytes(so3+'\n');
                mTxaStatus.append("Đã gửi kết quả về cho Client thành công\n\n");*/
            }
        } catch (Exception ex) {
            mTxaStatus.append("Server đã xảy ra lỗi\n");
        }
    }

    public void StopServer() {
        super.stop();
        try {
            mServer.close();
        } catch (IOException ex) {
            mTxaStatus.append("Server stop đã xảy ra lỗi\n");
        }
    }
}
