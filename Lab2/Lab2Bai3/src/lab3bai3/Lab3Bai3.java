/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3bai3;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Lab3Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int so = 0;         
        UnetiBook a = new UnetiBook();         
        UnetiBook[] u = null;         
        do {                    
            System.out.println("Nhap vao lua chon cua ban :");   
            System.out.println("1. Nhap thong tin n cuon sach Uneti :");
            System.out.println("2. Hien thi thong tin :");
            System.out.println("3. Sap xep thong tin theo giam dan theo nam xuat ban :");
            System.out.println("4. Tim kiem theo ten sach :");
            System.out.println("5. Tim kiem theo ten tac gia :");
            System.out.println("6. Thoat:");
            Scanner sc = new Scanner(System.in);   
            System.out.println("Moi chon : ");
            so = sc.nextInt();             
            switch (so) {                 
                case 1 ->  {                     
                    int n;     
                    System.out.println("----- Nhap thong tin : -----"); 
                    System.out.println("Nhap n cuon sach Uneti :");                     
                    n = sc.nextInt();
                    u = new UnetiBook[n];                     
                    for (int i = 0; i < n; i++) {                         
                        u[i] = new UnetiBook();                         
                        u[i].input();
                    }                     
                }
                case 2 ->  {                     
                    if (u == null) {                         
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {   
                        System.out.println("----- Hien thi thong tin : -----"); 
                        System.out.println("Du lieu ban vua nhap la :");                         
                        for (int i = 0; i < u.length; i++) {                  
                            System.out.println("STT : " + (i + 1));                             
                            u[i].display();
                        }                     
                    }                     
                }
                case 3 ->  {                     
                    if (u == null) {  
                        System.out.println("Ban chua nhap du lieu");                     
                    } 
                    else {   
                        System.out.println("----- Sap xep thong tin : -----"); 
                        
                        for (int i = 0; i < u.length - 1; i++) {             
                            for (int j = 0; j < u.length - i - 1; j++) {                 
                                if (u[j].getYearPublishing() < u[j + 1].getYearPublishing()) {                     
                                    UnetiBook tem = u[j];                     
                                    u[j] = u[j + 1];                     
                                    u[j + 1] = tem;                 
                                }         
                            }  
                        } 
                    }                     
                }
                case 4 -> {
                    if (u == null) {
                        System.out.println("Ban chua nhap du lieu");
                    } 
                    else{
                        System.out.println("----- Tim kiem theo ten sach : -----"); 
                        String timten ;
                        System.out.println("Nhap ten sach can tim : ");
                        timten = sc.nextLine();
                        int dem=0;
                        for (UnetiBook u1 : u) {
                            if (u1.getBookName()==timten) { 
                                dem++;
                                u1.display();
                               
                            } 
                            else {
                                System.out.println("Khong co san pham ban can! ");
                            }
                        }
                    }
                }
                case 5 -> {
                    if (u == null) {
                        System.out.println("Ban chua nhap du lieu");
                    } 
                    else{
                        System.out.println("----- Tim kiem theo ten tac gia : -----");
                        String timtacgia ;
                        System.out.println("Nhap ten tac gia can tim : ");
                        timtacgia = sc.nextLine();
                        int dem1=0;
                        for (UnetiBook u1 : u) {
                            if (u1.getBookAuthor().equals(timtacgia)) {
                                u1.display();
                                dem1++;
                            } 
                            else {
                                System.out.println("Khong co san pham ban can! ");
                            }
                        }
                    }
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
