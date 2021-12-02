/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3bai1;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Lab3Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XeMayHaNoi hanoi = new XeMayHaNoi();
        XeMayHoaBinh hoabinh = new XeMayHoaBinh();
        
        int so = 0;
        do {           
            
            System.out.println("Nhap vao lua chon cua ban :");   
            System.out.println("1. Nhap thong tin n xe may tai Hoa Binh :");
            System.out.println("2. Nhap thong tin n xe may tai Ha Noi :");
            System.out.println("3. Sap xep danh sach tang dan theo bien so xe :");
            System.out.println("4. Ti kiem thong tin xe theo bien so xe :");
            System.out.println("5. Thong ke so luong xe dang quan ly :");
            System.out.println("6. Thoat:");
            
            Scanner sc = new Scanner(System.in);   
            System.out.println("Moi chon : ");
            so = sc.nextInt();             
            switch (so) {                 
                case 1 ->  {                     
                    hoabinh.nhap();
                }
                
                case 2 ->  {                     
                    hanoi.nhap();
                }
                
                /*case 3 ->  {      
                    
                    if (hb == null) {  
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {
                        System.out.println("----- Sap xep thong tin tang theo bien so xe : -----"); 
                        
                        for (int i = 0; i < hb.length - 1; i++) {             
                            for (int j = 0; j < hb.length - i - 1; j++) {                 
                                if (hb[j].getBienso() < hb[j + 1].getBienso()) {                     
                                    XeMayHoaBinh tem = hb[j];                     
                                    hb[j] = hb[j + 1];                     
                                    hb[j + 1] = tem;                 
                                }         
                            }  
                        } 
                    } 
                    
                    if (hn == null) {  
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {
                        System.out.println("----- Sap xep thong tin tang theo bien so xe : -----"); 
                        
                        for (int i = 0; i < hn.length - 1; i++) {             
                            for (int j = 0; j < hn.length - i - 1; j++) {                 
                                if (hn[j].getBienso() < hn[j + 1].getBienso()) {                     
                                    XeMayHaNoi tem = hn[j];                     
                                    hn[j] = hn[j + 1];                     
                                    hn[j + 1] = tem;                 
                                }         
                            }  
                        } 
                    }                          
                }*/
                
                case 4 -> {
                }
                
                case 5 -> {
                }
                
                case 6 -> {
                }
                default ->  {                     
                    System.out.println("Khong co lua chon cua ban ");                     
                }             
            }         
        } while (so != 6); 
    }
    
}
