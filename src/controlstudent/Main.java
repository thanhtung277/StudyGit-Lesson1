package controlstudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * * @author ThanhTung
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        // khoi tao sinh vien va mon hoc
       // Student std = new Student();
        Subject sbj = new Subject();
      //  std.inputInfo();
        sbj.inputSubject();
        // hienthi thong tin mon hoc va sinh vien
      //  std.showInfo();
        sbj.showInfoSubject();
       

    }
   
}
