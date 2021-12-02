/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp;

/**
 *
 * @author Admin
 */
public class Products {
    private  String ID, name ;
    private  double giaSP;
    private  int  soluong;

    public Products(String ID, String name, int soluong, double giaSP) {
        this.ID = ID;
        this.name = name;
        this.soluong = soluong;
        this.giaSP = giaSP;
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoluong() {
        return soluong;
    }

//    public int edit(Products newProducts){
//        
//        return 0;
//        
//    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Products(){
        
    }
    
    
}
