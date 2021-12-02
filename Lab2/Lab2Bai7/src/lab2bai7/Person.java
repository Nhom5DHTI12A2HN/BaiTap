/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2bai7;

/**
 *
 * @author Cao Trinh
 */
public class Person {
    String hoten; 
    String diachi; 

    public Person() {
    }

    public Person(String hoten, String diachi) {
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", diachi=" + diachi + '}';
    }
    
    
    
}
