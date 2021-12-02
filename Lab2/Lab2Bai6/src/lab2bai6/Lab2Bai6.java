/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2bai6;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Lab2Bai6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        
        KhachNuocNgoai[] knn = null;  
        int n, m;     
        System.out.println("Nhap so nguoi can thu tien dien :"); 
        m = sc.nextInt();
        System.out.println("\n----- Nhap thong tin nguoi nuoc ngoai : -----\n"); 
        System.out.println("Nhap so nguoi nuoc ngoai :");                     
        n = sc.nextInt();
        knn = new KhachNuocNgoai[n];
        for (int i = 0; i < n; i++) {                         
            knn[i] = new KhachNuocNgoai();                         
            knn[i].nhapnn();
        }    
        
        System.out.println("\n----- Hien thi thong tin nguoi nuoc ngoai: -----\n");               
        for (int i = 0; i < knn.length; i++) {                  
            System.out.println("STT : " + (i + 1));                             
            knn[i].xuatnn();
        }  
        
        KhachVietNam[] kvn = null; 
        System.out.println("\n----- Nhap thong tin nguoi viet nam : -----\n"); 
        System.out.println("So nguoi viet nam :" + (m - n)); 
        kvn = new KhachVietNam[(m - n)];
        for (int i = 0; i < m - n; i++) {                         
            kvn[i] = new KhachVietNam();                         
            kvn[i].nhapvn();
        }    
        
        System.out.println("\n----- Hien thi thong tin nguoi viet nam: -----\n");                 
        for (int i = 0; i < kvn.length; i++) {                  
            System.out.println("STT : " + (i + 1));                             
            kvn[i].xuatvn();
        } 
        
        System.out.println("\n----- Hien thi trung binh tien dien cua nguoi nuoc ngoai : -----\n"); 
        double tbttnn = 0, s = 0;                      
        for (int i = 0; i < knn.length; i++) {  
            s = s + knn[i].thanhtien;
        }  
        tbttnn = s / knn.length;
        System.out.println("Trung binh cong = " + tbttnn);  
    }
    
}
