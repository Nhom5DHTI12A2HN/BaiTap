/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Login.Interface;
import java.rmi.*;
/**
 *
 * @author CaoTrung
 */
public interface LoginInterface extends  Remote{
    public  boolean  getLogin(String User, String Pass) throws RemoteException;
    
}
