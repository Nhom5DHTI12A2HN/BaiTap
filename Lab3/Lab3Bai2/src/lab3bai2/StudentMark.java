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
public abstract class StudentMark implements Imark{
    private String StuId; 
    private String className; 
    private String subjectName; 
    private int semester;
    private float mark;

    public StudentMark() {
    }

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ID : ");
        StuId=sc.nextLine();
        System.out.print("Nhap vao ten lop : ");
        className= sc.nextLine();
        System.out.print("Nhap vao ten chu de : ");
        subjectName= sc.nextLine();
        System.out.print("Nhap vao hoc ky : ");
        semester=sc.nextInt();
        System.out.print("Nhap vao diem : ");
        mark=sc.nextFloat();
    }
    
    public void display(){
        System.out.print("ID : " + StuId);
        System.out.print("Ten lop : " + className);
        System.out.print("Ten chu de : " + subjectName);
        System.out.print("Hoc ky : " + semester);
        System.out.print("Diem : " + mark);
    }
}
