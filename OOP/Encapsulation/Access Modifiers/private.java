///MAsum
import java.io.*;
import java.util.Scanner;

/*
    private : If a variable or method is declared as private in a class,
              it can only be accessed within that class itself.
              It is not accessible from outside the class (not even by subclasses).
*/

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student("Masum" , 22);
        student.printInfo();
    }
}
