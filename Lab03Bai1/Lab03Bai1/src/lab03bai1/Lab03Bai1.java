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
public class Lab03Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        XeMayHaNoi hanoi=new XeMayHaNoi();
        XeMayHoaBinh hoabinh=new XeMayHoaBinh();
        int so=0;
        do
        {
            System.out.println("Nhap vao lua chon : ");
            System.out.println("1.Nhap thong tin n xe may o Hoa Binh :");
            System.out.println("2.Nhap thong tin n xe may o Ha Noi :");
            System.out.println("3.Sap xep danh sach bien so : ");
            System.out.println("4.Tim kiem Thong tin xe : ");
            System.out.println("5. Thong ke so luong xe dang quan ly:");
            System.out.println("Thoat");
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Moi chon : ");
            so = sc.nextInt();
            switch (so){
                case 1 :
                    hoabinh.nhap();
                    hoabinh.hienthi();
                    break;
                
                case 2 : 
                    hanoi.nhap();
                    hanoi.hienthi();
                    break;
                
            }
       
            } while (so!=3);
            
         } 
}

        
