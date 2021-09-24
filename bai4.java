/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author LEVONO
 */
public class bai4 {
 public static void main(String[] args) {
 int a,x;
 Scanner sc = new Scanner(System.in);       
 System.out.print("Nhap so dien:");
 a = sc.nextInt();
 if(a<50){
     x=a*5000; 
     System.out.println("Tien phai dong: "+x);
         }
 else{
     x=50*5000+(a-50)*1200;
     System.out.println("Tien phai dong: "+x);
     }
 }
}
 
 

 



