/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3bai2;

import java.util.Scanner;

/**
 *
 * @author Cao Trinh
 */
public abstract class StudentUneti implements Imark{
    private String StuId; 
    private String StuName; 
    private String gender; 
    private String birthday; 
    private String nativePlace; 

    public StudentUneti() {
    }

    public StudentUneti(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ID : ");
        StuId=sc.nextLine();
        System.out.print("Nhap vao ten : ");
        StuName= sc.nextLine();
        System.out.print("Nhap vao gioi tinh : ");
        gender=sc.nextLine();
        System.out.print("Nhap vao ngay sinh : ");
        birthday=sc.nextLine();
        System.out.print("Nhap vao que quan : ");
        nativePlace=sc.nextLine();
    }
    
    public void display(){
        System.out.print("ID : " + StuId);
        System.out.print("Ten : " + StuName);
        System.out.print("Gioi tinh : " + gender);
        System.out.print("Ngya sinh : " + birthday);
        System.out.print("Que quan : " + nativePlace);
    }
}
