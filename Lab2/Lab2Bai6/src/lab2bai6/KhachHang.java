/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2bai6;

import java.util.Date;

/**
 *
 * @author Cao Trinh
 */
public class KhachHang {
    String maKH; 
    String hotenKH; 
    int soLuong; 
    double dongia; 
    double thanhtien; 
    Date ngayHD; 

    public KhachHang() {
    }

    public KhachHang(String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.soLuong = soLuong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.ngayHD = ngayHD;
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
    
    
}
