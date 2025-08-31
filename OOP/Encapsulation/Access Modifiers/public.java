///MAsum
import java.io.*;
import java.util.Scanner;

/*
    public : If a variable or method is declared as public in a class,
             it can be accessed from anywhere, provided the class itself is accessible.
*/

class Student {
    public String name;

    Student(String name) {
        this.name = name;
    }

    public void PrintInfo() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student s1 =  new Student("Masum");

        s1.PrintInfo();
    }
}
