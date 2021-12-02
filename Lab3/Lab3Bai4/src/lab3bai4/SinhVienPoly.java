/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3bai4;
import  java.util.Scanner;
/**
 *
 * @author Cao Trinh
 */
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;
    public double diem;
    public String hocLuc;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh, double diem) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.diem = diem;
    }
        
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }
   
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap danh sach sinh vien : ");
        System.out.println("\nNhap ho va ten sinh vien : ");
        hoTen = sc.nextLine();
        System.out.println("\nNhap nganh hoc cua sinh vien : ");
        nganh = sc.nextLine();
        System.out.println("\nNhap diem cua sinh vien : ");
        diem = sc.nextFloat();
    }
    
    public void hienthi(){
        System.out.println("\nHo va ten sinh vien : " + hoTen);
        System.out.println("\nNganh hoc : " + nganh);
        if(diem >= 8)
            System.out.println("Hoc luc gioi!");
        else if(diem > 7 && diem < 8)
            System.out.println("Hoc luc kha!");
        else if(diem >= 5 && diem <= 7)
            System.out.println("Hoc luc trung binh!");
        else if(diem < 5)
            System.out.println("Hoc luc yeu!");
    }
}

