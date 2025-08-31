///MAsum
import java.io.*;
import java.util.Scanner;

/*
    protected : If a variable or method is declared as protected in a class,
                it can be accessed:
                  - Within the same class
                  - By any class in the same package
                  - By subclasses (even if they are in different packages)
                It provides more accessibility than private, but less than public.
*/

class Student {
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void printInfo() {
        System.out.println(name + " " + age);
    }
}

class Graduate extends Student{
    protected String degree;

    public Graduate(String degree, String name, int age) {
        super(name, age);
        this.degree = degree;
    }

    public void showDetails() {
        System.out.println(name + ".");
        System.out.println("Graduating in " + degree + " from Metropalitan University");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Graduate student = new Graduate("Bsc" , "Masum" , 22);
        student.showDetails();
    }
}
