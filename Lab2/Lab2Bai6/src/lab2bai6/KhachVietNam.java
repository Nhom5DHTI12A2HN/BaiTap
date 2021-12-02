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
public class KhachVietNam extends KhachHang{
    String loaiKH; 
    int dinhmuc;

    public KhachVietNam() {
    }

    public KhachVietNam(String loaiKH, int dinhmuc) {
        this.loaiKH = loaiKH;
        this.dinhmuc = dinhmuc;
    }

    public KhachVietNam(String loaiKH, int dinhmuc, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.loaiKH = loaiKH;
        this.dinhmuc = dinhmuc;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
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
    
    public void nhapvn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khang hang : ");
        maKH = sc.nextLine();
        System.out.println("Nhap ho ten khach hang : ");
        hotenKH = sc.nextLine();
        System.out.println("Nhap so luong dien tieu thu : ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia : ");
        dongia = sc.nextDouble();
        //System.out.println("Nhap ngay ra hoa don : ");
        //ngayHD = sc.next(Date);
        System.out.println("Nhap loại khach hang(sinhhoat, kinhdoanh, sanxuat) : ");
        loaiKH= sc.nextLine();
        System.out.println("Nhap dinh muc : ");
        dinhmuc = sc.nextInt();
    }
    
    public void xuatvn(){
        System.out.println("Ma khach hang : " + maKH);
        System.out.println("Ho ten khach hang : " + hotenKH);
        System.out.println("So luong dien tieu thu : " + soLuong);
        System.out.println("Don gia : " + dongia);
        System.out.println("Loai khach hang : " +loaiKH);
        System.out.println("Dinh muc : " + dinhmuc);
        
        if(soLuong <= dinhmuc)
        {
            thanhtien = soLuong * dongia ;
        }
        else 
        {
            thanhtien = dongia * dinhmuc + (soLuong - dinhmuc) * dongia * 2.5;
        } 
        
        System.out.println("Thanh tien : " + thanhtien);
    }
}
