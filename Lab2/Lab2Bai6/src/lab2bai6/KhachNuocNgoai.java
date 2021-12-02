/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2bai6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public class KhachNuocNgoai extends KhachHang{
    String quoctich;

    public KhachNuocNgoai() {
    }

    public KhachNuocNgoai(String quoctich) {
        this.quoctich = quoctich;
    }

    public KhachNuocNgoai(String quoctich, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    
    public void nhapnn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khang hang : ");
        maKH = sc.nextLine();
        System.out.println("Nhap ho ten khach hang : ");
        hotenKH = sc.nextLine();
        System.out.println("Nhap so luong dien : ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia : ");
        dongia = sc.nextDouble();
        //System.out.println("Nhap ngay ra hoa don : ");
        //ngayHD = sc.next(Date);
        System.out.println("Nhap quoc tich : ");
        quoctich = sc.nextLine();
        //thanfht iền
    }
    
    public void xuatnn(){
        System.out.println("Ma khach hang : " + maKH);
        System.out.println("Ho ten khach hang : " + hotenKH);
        System.out.println("So luong dien tieu thu : " + soLuong);
        System.out.println("Don gia : " + dongia);
        System.out.println("Quoc tich : " + quoctich);
        thanhtien = soLuong * dongia ;
        System.out.println("Thanh tien : " + thanhtien);
    }
    
}
