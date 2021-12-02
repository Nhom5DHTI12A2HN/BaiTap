/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3bai3;

/**
 *
 * @author Cao Trinh
 */
public class Boss extends Employee {
     private float luong;  
     public float getLuong() {  
         return luong;       
     }      
     public void setLuong(float luong) {  
         this.luong = luong;       
     } 
     @Override  
     public float earnings() {   
         return luong=4500;  
     }  
     @Override  
     public void hienthi() {   
         System.out.println("luong :"+luong);  
     }
}
