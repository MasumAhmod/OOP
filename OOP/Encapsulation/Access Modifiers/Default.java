///MAsum
import java.io.*;
import java.util.Scanner;

/*
    default (package-private) :
        If no access modifier is specified for a class, method, or variable,
        then it has default access (also called package-private).

        - Accessible only within the same package.
        - Not accessible from classes in different packages.
*/

class Student {
    String name;
    int age;

    Student(String name, int age) {
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
