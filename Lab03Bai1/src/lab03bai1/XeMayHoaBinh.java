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
public class XeMayHoaBinh extends Xemay {
private int n;
    Xemay[] mangxe;

    public XeMayHoaBinh(String bienso, String loaixe, String mauxe, float giatien, int n, Xemay[] mangxe) {
        super ();
        this.n = n;
        this.mangxe = mangxe;
    }

    public XeMayHoaBinh() {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong xe may o hoa binh");
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
    
