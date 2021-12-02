/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login.Server;
import  java.rmi.*;
import java.rmi.registry.Registry;
import Login.Implement.LoginImplement;
/**
 *
 * @author CaoTrung
 */
public class LoginServer {
    public static void main(String[] args) {
        try {
               Registry reg = LocateRegistry.createRegistry(1099);
               LoginImplement lp = new LoginImplement();
               reg.rebind("login", lp);
               System.out.println("Server is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
