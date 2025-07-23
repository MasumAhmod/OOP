///Masum
import java.io.*;
import java.util.Scanner;

/*
Dynamic Method Dispatch : method call to an overridden method is resolved at runtime;
parent class reference and parent class reference
*/

class Parent {
    private String name , Profession;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /// Parent Class Method
    void show() {
        System.out.println("Name       : " + name);
        System.out.println("Profession : " + Profession);
        System.out.println("Age        : " + age);
    }
}

class Son extends Parent {
    private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    @Override
    void show() {
        /*
        use super keyword to call parent class method
        */
        super.show();

        // System.out.println("Name       : " + getName());
        // System.out.println("Profession : " + getProfession());
        // System.out.println("Age        : " + getAge());
        System.out.println("Student ID : " + StudentId);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Parent p = new Son();
        p.setName("Alice");
        p.setProfession("Student");
        p.setAge(22);

        //DownCAst
        ((Son)p).setStudentId("323233");

        p.show();
    }
}




