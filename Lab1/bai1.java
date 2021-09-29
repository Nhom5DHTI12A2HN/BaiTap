/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author LEVONO
 */
import java.util.Scanner;

public class bai1 {
public static void main(String[] args) {
  int a;
  char ch;
  String str;
          
  Scanner sc = new Scanner(System.in);
 System.out.println("Nhap mot so nguyen:");
 a = sc.nextInt();
 System.out.println("Nhap mot ki tu:");
 sc.nextLine();
 ch = sc.nextLine().charAt(0);
 System.out.println("Nhap mot chuoi:");
 str = sc.nextLine();
 System.out.println("Du lieu vua nhap:");
 System.out.println("a="+a);
 System.out.println("ch="+ch);
 System.out.println("str="+str);
 }
 }

