/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author LENOVO
 */
public class Lab8Bai2 {

    static final int defaultPort = 3306;

    public static void main(String[] args) {
        int portNumber;
        Socket ClientSocket;
        BufferedReader timeStream;
        String hostName;
        switch (args.length) {
            case 1:
                hostName = args[0];
                portNumber = defaultPort;//daytimePort;
                break;

            default:
                hostName = "localhost";
                portNumber = defaultPort;
        }
        try {
            // Thực hiện kết nối tới Server
            ClientSocket = new Socket(hostName, portNumber);
            // Tạo luồng dữ liệu từ kết nối
            timeStream = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
            // Lấy dữ liệu từ Server
            String timeString = timeStream.readLine();
            System.out.println("It is " + timeString + " at " + hostName);
            // Đóng kết nối
            timeStream.close();
            ClientSocket.close();
        } catch (UnknownHostException e) {
            System.out.println(" Unknown host error");
        } catch (ConnectException e) {
            System.out.println(" Service unavailable on port " + portNumber + " of host  " + hostName);
        } catch (IOException e) {
            System.out.println(" Communication error occured\r\n " + e);
        }
    }
}
