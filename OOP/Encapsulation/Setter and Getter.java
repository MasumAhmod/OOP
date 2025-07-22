///Masum
import java.io.*;
/*
  Setter and Getter ;
  To get access an private variable or method
*/

class Encap {
    String name;
    int age;

    private String studentID;
    private double CGPA;

    ///getValue of this private variable
    public String getStudentID() {
        return studentID;
    }

    ///setValue for this private variable
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    ///private method
    private boolean hasHonors() {
        return CGPA >= 3.75;
    }

    ///to get access of private method
    public void checkHonorStatus() {
        if (hasHonors()) {
            System.out.println("Eligible for Honors");
        } else {
            System.out.println("Not eligible for Honors");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Encap myInfo = new Encap();

        myInfo.setStudentID("232-115-**2");
        System.out.println(myInfo.getStudentID());

        myInfo.setCGPA(3.78);
        System.out.println(myInfo.getCGPA());

        myInfo.checkHonorStatus();
    }
}




