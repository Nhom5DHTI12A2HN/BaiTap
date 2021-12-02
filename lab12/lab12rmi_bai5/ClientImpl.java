/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12rmi_bai5;
import java.io.Serializable;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.*;
/**
 *
 * @author Pham Tuan
 */
public class ClientImpl implements Client, Serializable {
    {
 private  BankManager bankManager;
 private String ClientName;
 public ClientImpl(BankManager bm, String name)
 {
 this.bankManager = bm;
 this.ClientName = name;
 }
 public BankManager getBankManager() throws RemoteException
 {
 return bankManager;
 }
 public String getName() throws RemoteException
 {
 return ClientName;
 }
}
