/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4bai1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vietnguyen
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien>dsSv=new ArrayList<SinhVien>(); 
    
    public boolean ktTrungma(String masv)  {   
        for(SinhVien sv : dsSv)   {    
            if(sv.getMasv().equalsIgnoreCase(masv))     
                return true;   
        }   
        return false;  
    }              
    
    public boolean addSinhvien(SinhVien sv)  {   
        if(ktTrungma(sv.getMasv()))    
            return false;   
        return dsSv.add(sv);                       
    }              
    
    public SinhVien findSinhvien1(String masv) {   
        for(SinhVien sv : dsSv)   {    
            if(sv.getMasv().equalsIgnoreCase(masv))     
                return sv;   
        }   
        return null;  
    }            
    
    public int findSinhvien2(String masv)  {   
        for(int i=0;i<dsSv.size();i++)   {    
            if(dsSv.get(i).getMasv().equalsIgnoreCase(masv))     
                return i;   
        }   
        return -1;  
    }            
    
    
    public SinhVien updateSinhvien(int index,SinhVien sv)  {   
        return dsSv.set(index, sv);  
    }             
    
    public void removeSinhvien(String masv)  {   
        SinhVien sv=findSinhvien1(masv);   
        dsSv.remove(sv);  
    }  
    
    public String toString() {   
        return dsSv.toString();  
    }
    
    public void sort() {   
        Collections.sort(dsSv);  
    } 
    
}
