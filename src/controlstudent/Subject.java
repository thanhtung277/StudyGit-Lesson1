/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstudent;

import java.util.Scanner;

/**
 *
 * @author ThanhTung
 */
public class Subject {

    private String subjectCode;
    private String subjectName;
    private int subjectNumber;
    private int subjectTime;
    private int examNumber;
    private String teacher;

    public Subject() {
    }

    public Subject(String subjectCode, String subjectName, int subjectNumber, int subjectTime, int examNumber, String teacher) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
        this.subjectTime = subjectTime;
        this.examNumber = examNumber;
        this.teacher = teacher;
    }
    

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectNumber() {
        return subjectNumber;
    }
// so tin chi cua mon hoc

    public boolean setSubjectNumber(int subjectNumber) {
        if (subjectNumber >= 1 && subjectNumber <= 4) {
            this.subjectNumber = subjectNumber;
            return true;
        } else {
            System.out.println("So tin chi phai lon hon 1 va nho hon 4");
            return false;
        }
    }

    public int getSubjectTime() {
        return subjectTime;
    }
// thoi gian cua mon hoc

    public void setSubjectTime(int subjectTime) {
        this.subjectTime = subjectTime;
    }

    public int getExamNumber() {
        return examNumber;
    }
// so bai kiem tra  

    public boolean setExamNumber(int examNumber) {
        if (examNumber > 1 && examNumber < 5) {
            this.examNumber = examNumber;
            return true;
        } else {
            System.out.println("So bai kiem tra phai tu 1 den 5");
            return false;
        }

    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    // phuong thuc cua mon hoc
    public void showInfoSubject() {
        System.out.println(toString());
    }

    public void inputSubject() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input information Subject please: ");
        System.out.println("Subject Name: ");
        subjectName = sc.nextLine();
        System.out.println("Subject Code: ");
        subjectCode = sc.nextLine();
        System.out.println("Subject Number");
        //dieu kien so tin chi phai lon hon 1 va nho hon 4.
        while (true) {

            int subjectNumber = sc.nextInt();
            boolean check = setSubjectNumber(subjectNumber);
            if (check) {
                break;
            }
        }

        System.out.println("Subject time: ");
        subjectTime = sc.nextInt();
        System.out.println("Exam Number: ");
//        while(true){
//            examNumber=sc.nextInt();
//            boolean check = setExamNumber(examNumber);
//            if (check) {
//                break;
//            }
//        }
        // cach viet 2
        while (!setExamNumber(sc.nextInt()));
        sc.nextLine();
        System.out.println("Name of Teacher: ");
        teacher = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Subject: {Name: " + subjectName + " Code: " + subjectCode
                + " SubjectNumber: " + subjectNumber + " Subject time: " +subjectTime
                + " Count Exam: " + examNumber + " Teacher: " + teacher;

    }
        
}
