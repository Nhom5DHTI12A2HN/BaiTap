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
public class NewThread extends Thread{
    private int count;
    private Socket cl = null;
    private BufferedReader inp = null;//luong nhap
    private PrintWriter outp = null;//luong xuat

    NewThread(Socket cl, int count) {
        super();//Truy xuất cấu tử lớp Thread
        this.cl = cl;
        this.count = count;
        start();
    }
    public void run() {
        try {
            //tao luong nhap /xuat cho socket cl
            inp = new BufferedReader(new InputStreamReader(cl.getInputStream()));
            outp = new PrintWriter(cl.getOutputStream(), true);
            //Doc ban kinh gui toi tu Client
            double r = Double.parseDouble(inp.readLine().trim());
           // lay dia chi Client
            InetAddress addrClient = cl.getInetAddress();
            //lay so cong phia Client
            int portClient = cl.getPort();
              //Tinh dien tich
            double area = 3.14 * r * r;
             //Hien thi
            System.out.println("Luong thu:" + count + ", Client:" + addrClient.getHostName() + ", ip:" + addrClient.getHostAddress() + ",port:" + portClient + ",r=" + r + ",area:" + area + "");

              //Gui dien tich ve cho Client tuong ung
            outp.println(area);
//ket thuc luong
            inp.close();
            outp.close();
            cl.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
