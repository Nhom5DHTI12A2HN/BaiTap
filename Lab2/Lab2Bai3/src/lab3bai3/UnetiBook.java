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
public class UnetiBook extends Book{
    private String language; 
    private int semester; 

    public UnetiBook() {
    }

    public UnetiBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public UnetiBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public void input(){
        super.input1();           
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngon ngu : ");
        language = sc.nextLine();
        System.out.println("Nhap hoc ky : ");
        semester = sc.nextInt();
    }
    
    public void display(){
        super.display1();
        System.out.println("Ngon ngu : " + language);
        System.out.println("Hoc ky : " + semester);
    }
}
