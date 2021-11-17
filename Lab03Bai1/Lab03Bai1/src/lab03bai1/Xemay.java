/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03bai1;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Xemay implements IXe{
    String bienso;
    String loaixe;
    String mauxe;
    float giatien;

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap bien so xe: ");
        bienso=sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaixe= sc.nextLine();
        System.out.print("Nhap mau xe: ");
        mauxe=sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giatien=sc.nextFloat();
        
    }

    @Override
    public void hienthi() {
        System.out.print("Bien so xe :"+ bienso);
        System.out.print("Loai xe :"+ loaixe);
        System.out.print("Mau xe :"+ mauxe);
        System.out.print("Gia tien : :"+ giatien);
    }
}
