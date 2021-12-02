/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3bai3;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class Book {
    private String bookName; 
    private String bookAuthor; 
    private String producer; 
    private int yearPublishing; 
    private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void input1(){
        System.out.println("Nhap vao thong tin :");             
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach : ");
        bookName= sc.nextLine();
        System.out.println("Nhap ten tac gia : ");
        bookAuthor = sc.nextLine();
        System.out.println("Nhap nha xuat ban : ");
        producer = sc.nextLine();
        System.out.println("Nhap nam xuat ban : ");
        yearPublishing = sc.nextInt();
        System.out.println("Nhap gia ban : ");
        price = sc.nextFloat();
    }
    
    public void display1(){
        System.out.println("Ten sach : " + bookName);
        System.out.println("Ten tac gia : " + bookAuthor);
        System.out.println("Nha xuat ban : "+ producer);
        System.out.println("Nam xuat ban : " + yearPublishing);
        System.out.println("Gia ban : " + price);
    }
}
