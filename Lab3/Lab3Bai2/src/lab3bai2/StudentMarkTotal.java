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
public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject; 
    private float everageMark;

    public StudentMarkTotal() {
    }

    public StudentMarkTotal(int totalExamSubject, float everageMark) {
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
    
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tong so mon thi : ");
        totalExamSubject=sc.nextInt();
        System.out.print("Nhap vao diem trung binh : ");
        everageMark=sc.nextFloat();
    }
    
    public void display(){
        super.display();
        System.out.print("Tong so mon thi : " + totalExamSubject);
        System.out.print("Diem trung binh : " + everageMark);
    }
}
