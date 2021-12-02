/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12rmi_bai5;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.*;
/**
 *
 * @author Pham Tuan
 */
public interface Client extends Remote {
     //Phương thức trả về ngân hàng quản lý Client này
 public BankManager getBankManager() throws RemoteException;
 //Phương thức trả về tên của Client
 public String getName() throws RemoteException;
}
