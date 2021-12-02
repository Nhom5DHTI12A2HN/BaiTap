/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login.Implement;
import  java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import Login.Interface.LoginInterface;
/**
 *
 * @author CaoTrung
 */
public class LoginImplement extends UnicastRemoteObject implements LoginInterface{
    public LoginImplement() throws RemoteException{
    
    }
    public  boolean  getLogin(String User, String Pass) throws RemoteException{
        boolean found = false;
        try {
            if(User.equals("admin") && Pass.equals("1234"))
            {
                return  found = true;
            }
            else 
            {
                return found = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  found;
    }
}
