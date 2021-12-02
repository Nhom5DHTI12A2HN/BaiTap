/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2bai2;
import java.util.Scanner;
/**
 *
 * @author Cao Trinh
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    Product(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Product(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
    
    public void input(){
        System.out.println("Nhap vao thong tin :");             
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang hoa : ");
        maHH = sc.nextLine();
        System.out.println("Nhap ten hang hoa : ");
        tenHH = sc.nextLine();
        System.out.println("Nhap so luong : ");
        soLuong =sc.nextFloat();
        System.out.println("Nhap gia ban 1 san pham : ");
        gia1SP =sc.nextFloat();
    }
    
    public void display(){
        System.out.println("Ma hang hoa : " + maHH);
        System.out.println("Ten hang hoa : " + tenHH);
        System.out.println("So luong : "+ soLuong);
        System.out.println("Gia ban 1 san pham : " + gia1SP);
    }

    public int compareTo(Product o) {
        return o.compareTo(o);
    }
    
}
