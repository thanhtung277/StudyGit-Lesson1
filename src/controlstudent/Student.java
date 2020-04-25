/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstudent;

/**
 *
 * @author ThanhTung
 */
import java.util.Scanner;

/**
 *
 * @author ThanhTung
 */
public class Student {
    // 1. tao cac thuoc tinh
    private String name;
    private String address;
    private String email;
    private int phone;
    private String studentCode;
    private float fee;
//2. ham tao khong tham so
    public Student() {
    }
//3. ham tao day du tham so
    public Student(String name, String address, String email, int phone,
            String studentCode, float fee) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.studentCode = studentCode;
        this.fee = fee;
    }
    // 4. cac bo getter, setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
   
    
    // tostring de hien thi day du thong tin dung overirde 

    @Override
    public String toString() {
        return "Student{" + "name = " + name + ", address = " + address + ", email = "
            + email + ", phone = " + phone + ", studentCode = " + studentCode +
                ", fee = " + fee + '}';
    }
    //4. cac phuong thuc
    // phuong thuc di hoc
    void goToSchool(String subject){
        System.out.println(this.name+"Go to school"+subject);
    }
    //5. phuong thuc lam bai kiem tra
    void doExam(String subject){
        System.out.println(this.name+"Do the exam"+subject);
    }
    //6.phuong thuc nop hoc phi
    void dofee(){
        System.out.println("Fee of"+this.name+" is"+this.fee);
    }
    //7.phuong thuc lam bai tap ve nha
    void doHomeWorks(String subject){
        System.out.println(this.name+"is doing "+subject+" HomeWork");
    }
    // nhap thong tin
      public void  inputInfo(){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of student: ");
        name =sc.nextLine();
        System.out.println("Address of student: ");
        address =sc.nextLine();
        System.out.println("Email: ");
        email =sc.nextLine();
        System.out.println("Phone: ");
        phone = sc.nextInt();
        
        sc.nextLine();// them 1 dong nay boi vua nhap kieu int ben tren no se 
        // lam mat gia tri cua dong studentcode nen can xoa di de nhap lai
        System.out.println("Student Code: ");
        studentCode = sc.nextLine();    
        System.out.println("Fee of student: ");
        fee=sc.nextFloat();
       
    }

    
    //phuong thuc hien thi thong tin
    public void showInfo(){
        System.out.println(toString());
    }
    
}
 
