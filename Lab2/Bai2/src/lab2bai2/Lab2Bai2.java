/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2bai2;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Lab2Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product a = new Product();         
        Product[] product = null;   
        
        Scanner sc = new Scanner(System.in);
        
        int n;                     
        System.out.println("Nhap vao so hang hoa :");                     
        n = Integer.parseInt(sc.nextLine());                     
        product = new Product[n];   
        
        for (int i = 0; i < n; i++) {    
            System.out.println("STT " + (i + 1));
            product[i] = new Product();                         
            product[i].input();
        }    
        
        for (int i = 0; i < product.length; i++) {                  
            System.out.println("Thong tin hang hoa thu " + (i + 1));                             
            product[i].display();
        }
        
        System.out.println("-----San pham co gia cao nhat : -----");
        float max = 0;
        for (int i = 0; i < product.length; i++) {  
            if(max < product[i].getGia1SP())
            {
                max = product[i].getGia1SP();
            }
            product[i].display();
        }
        
        System.out.println("-----Sap xep giam dan theo gia : -----");
        for (int i = 0; i < product.length - 1; i++) {             
            for (int j = i + 1; j < product.length; j++) {                 
                if (product[i].getGia1SP() < product[j].getGia1SP()) {                     
                    Product tem = product[i];                     
                    product[i] = product[j];                     
                    product[j] = tem;                 
                }            
            } 
            product[i].display();
        } 
        
        System.out.println("-----Tim san pham Sua : -----");
        for (int i = 0; i < product.length; i++) {  
            if (product[i].getTenHH().equals("sua") || product[i].getTenHH().equals("SUA")){
                product[i].display();
            }
            else
                System.out.println("Khong co sua! ");
        }
    }
    
}
