///Masum
import java.io.*;
import java.util.Scanner;

/*
     to call another constructor of the same class.
*/

class Classs {
    double salary = 56000;
    String name;

    Classs() {
        this(56000.00, "");
    }

    Classs(double salary , String name) {
        this.salary = salary;
        this.name = name;

        System.out.println("Salary for this employee is : " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Classs s = new Classs(620000.00 , "Masum");
    }
}
