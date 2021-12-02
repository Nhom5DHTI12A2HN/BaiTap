/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2bai1;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Lab2Bai1 {
     
     
    public static void main(String[] args) {
        int n = 0;         
        Product a = new Product();         
        Product[] product = null;         
        do {                    
            System.out.println("Nhap vao lua chon cua ban :");   
            System.out.println("1. Nhap thong tin :");
            System.out.println("2. Hien thi thong tin :");
            System.out.println("3. Sap xep thong tin theo giam dan :");
            System.out.println("4. Thoat:");
            Scanner sc = new Scanner(System.in);            
            n = Integer.parseInt(sc.nextLine());             
            switch (n) {                 
                case 1: {                     
                    int m;                     
                    System.out.println("Nhap vao so hang hoa :");                     
                    m = Integer.parseInt(sc.nextLine());                     
                    product = new Product[m];                     
                    for (int i = 0; i < m; i++) {                         
                        product[i] = new Product();                         
                        product[i].nhap();                     
                    }                     
                    break;                 
                }                 
                case 2: {                     
                    if (product == null) {                         
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {                         
                        System.out.println("Du lieu ban vua nhap la :");                         
                        for (int i = 0; i < product.length; i++) {                  
                            System.out.println("Thong tin hang hoa thu " + (i + 1));                             
                            product[i].hienthi();                         
                        }                     
                    }                     
                    break;                 
                }                 
                case 3: {                     
                    if (product == null) {  
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {                         
                        a.sort(product);                      
                        System.out.println("Du lieu sau khi sap xep  la :");                         
                        for (int i = 0; i < product.length; i++) {                  
                            System.out.println("Thong tin hang hoa thu " + (i + 1));                             
                            product[i].hienthi();                         
                        }                     
                    }                     
                    break;                 
                }                 
                case 4:                     
                    break;                 
                default: {                     
                    System.out.println("Khong co lua chon cua ban ");                     
                    break;                 
                }             
            }         
        } while (n != 4); 
    }
}
