package Accsess_SM_SP.ThucHanh;

import Accsess_SM_SP.ThucHanh.TH1_Student;

public class Student2 {
    public static void main(String args[]) {
        TH1_Student.change(); //calling change method

        //creating objects
        TH1_Student s1 = new TH1_Student(111, "Hoang");
        TH1_Student s2 = new TH1_Student(222, "Khanh");
        TH1_Student s3 = new TH1_Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
