/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author CaoTrung
 */
public class ClientControl {

    private ClientView view;
    private int ServerPort = 5555;
    private int ClientPort = 6666;
    private String ServerHost = "localhost";
    private DatagramSocket myClient;

    public ClientControl(ClientView view) {
        this.view = view;
        this.view.addLoginListener((ActionListener) new LoginListener());
    }

    class LoginListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            openConnection();
            User user = view.getUser();
            sendData(user);
            String result = receiveData();
            if (result.equals("ok")) {
                view.showMessage("Login succesfully!");
            } else {
                view.showMessage("Invalid username and/or password!");
            }
            closeConnection();
        }
    }

    private void openConnection() {
        try {
            myClient = new DatagramSocket(ClientPort);
        } catch (Exception ex) {
            view.showMessage(ex.getStackTrace().toString());
        }
    }

    private void closeConnection() {
        try {
            myClient.close();
        } catch (Exception ex) {
            view.showMessage(ex.getStackTrace().toString());
        }
    }

    private void sendData(User user) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(user);
            oos.flush();
            InetAddress IPAddress = InetAddress.getByName(ServerHost);
            byte[] sendData = baos.toByteArray();
            DatagramPacket sendPacket = new DatagramPacket(sendData,
                    sendData.length, IPAddress, ServerPort);
            myClient.send(sendPacket);
        } catch (Exception ex) {
            view.showMessage(ex.getStackTrace().toString());
        }
    }

    private String receiveData() {
        String result = "";
        try {
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket
                    = new DatagramPacket(receiveData, receiveData.length);
            myClient.receive(receivePacket);
            ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
            ObjectInputStream ois = new ObjectInputStream(bais);
            result = (String) ois.readObject();
        } catch (Exception ex) {
            view.showMessage(ex.getStackTrace().toString());
        }
        return result;
    }
}