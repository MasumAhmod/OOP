///Masum
import java.io.*;
import java.util.Scanner;

/*
     to point Current Object’s Instance Variable
*/

class Classs {
    double salary = 56000;

    final void show (double salary) {
        this.salary = salary;

        System.out.print("My Salary is : " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Classs s = new Classs();
        s.show(600000.00);
    }
}
