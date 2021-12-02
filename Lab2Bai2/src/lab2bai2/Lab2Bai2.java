/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        
        Scanner sc = new Scanner(System.in);
        int n, i=1;
        System.out.println("Nhap vao so hang hoa :");                     
        n = Integer.parseInt(sc.nextLine()); 
        ArrayList<Product> arrlist = new ArrayList<>(); 
        
        for (i = 1; i <= n; i++) {
            Product pr = new Product();
            System.out.println("STT : " + i);
            arrlist.add(pr);
            pr.input();
        }
        
        System.out.println("\nThong tin :"); 
        arrlist.forEach(pr -> {
            pr.display();
        });
        
        float max = 0; 
        for (Product pr : arrlist) {  
            if (max < pr.getGia1SP()) {   
                max = pr.getGia1SP();  
            } 
        } 
            
        System.out.println("\nThong tin mat hang co gia cao nhat la :"); 
        for (Product pr : arrlist) {  
            if (pr.getGia1SP() == max) {   
                pr.display();
            } 
        }
        
        Collections.sort(arrlist, (Product pr1, Product pr2) -> {
            if (pr1.getGia1SP() < pr2.getGia1SP()) {
                return 1;
            }
            else {
                if (pr1.getGia1SP() == pr2.getGia1SP()) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
        /*
        // sort list
        Collections.sort(arrlist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getTenHH().compareTo(o2.getTenHH());
            }
        });
        */
        System.out.println("\nDanh sach duoc sap xep giam dan theo gia la:"); 
         
        for (Product pr : arrlist) {  
            System.out.println("San pham thu :"+(i));  
            pr.display();
            i++; 
        }   
        
        System.out.println("\nDanh sach sua duoc tim la:"); 
        arrlist.forEach(pr -> {
            if (pr.getTenHH().equals("sua") || pr.getTenHH().equals("SUA"))   
                pr.display();
        });
    }
}
