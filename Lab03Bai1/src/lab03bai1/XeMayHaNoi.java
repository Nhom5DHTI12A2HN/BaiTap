/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03bai1;

import java.util.Date;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class XeMayHaNoi extends Xemay {
    private int n;
    Xemay[] mangxe;
    Scanner sc = new Scanner(System.in);
    public XeMayHaNoi(String bienso, String loaixe, String mauxe, float giatien, int n, Xemay[] mangxe) {
        super();
        this.n = n;
        this.mangxe = mangxe;
    }

    public XeMayHaNoi() {
        super();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Xemay[] getMangxe() {
        return mangxe;
    }

    public void setMangxe(Xemay[] mangxe) {
        this.mangxe = mangxe;
    }

    
    @Override
    public void nhap() {
        
        System.out.println("Nhap vao so luong xe may o ha noi : ");
        n = Integer.parseInt(sc.nextLine());
        mangxe = new Xemay[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin xe may thu :" + (i + 1));
            mangxe[i] = new Xemay();
            mangxe[i].nhap();
        }
    }

    @Override
    public void hienthi() {
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin xe may thu :" + (i + 1));
            mangxe[i].hienthi();
        }
    }
}
    

