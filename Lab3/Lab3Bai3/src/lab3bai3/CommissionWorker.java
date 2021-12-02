/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3bai3;

/**
 *
 * @author Cao Trinh
 */
public class CommissionWorker extends Employee{
    float luong;  
    @Override  
    public float earnings() {  
        return luong=new Boss().earnings()+new PieceWorker().earnings();   
    }  
    @Override  
    public void hienthi() {    
        System.out.println("luong :"+luong);  
    }
}
