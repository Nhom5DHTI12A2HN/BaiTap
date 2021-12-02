/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2bai1;
import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
class Product {
    private   String tenHangHoa;     
    private   String nhaSanXuat;     
    private   float  giaBan; 
    /**
     * @param args the command line arguments
     */
    public Product(){}
    
    public String getTenHangHoa ( )
    {
        return tenHangHoa;
    }

    public void setTenHangHoa (String TenHangHoa)
    {
        tenHangHoa = TenHangHoa;           
    }
    
    public String getNhaXanXuat ( )
    {
        return nhaSanXuat;
    }

    public void setNhaXanXuat (String NhaXanXuat)
    {
        nhaSanXuat = NhaXanXuat;           
    }
    
    public float getGiaBan ( )
    {
        return giaBan;
    }

    public void setTenHangHoa (float GiaBan)
    {
        giaBan = GiaBan;           
    }
    
    public void nhap(){
        System.out.println("Nhap vao thong tin :");             
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten hang hoa : ");
        tenHangHoa = sc.nextLine();
        System.out.println("Nhap ten nha san xuat : ");
        nhaSanXuat = sc.nextLine();
        System.out.println("Nhap gia ban : ");
        giaBan = sc.nextFloat();
    }
    
    public void hienthi(){
        System.out.println("Ten hang hoa : " + tenHangHoa);
        System.out.println("Ten nha san xuat : "+ nhaSanXuat);
        System.out.println("Gia ban : " + giaBan);
    }
    
    public void sort(Product[] b){          
        for (int i = 0; i < b.length - 1; i++) {             
            for (int j = i + 1; j < b.length; j++) {                 
                if (b[i].giaBan > b[j].giaBan) {                     
                    Product tem = b[i];                     
                    b[i] = b[j];                     
                    b[j] = tem;                 
                }            
            }  
        } 
    } 
}
