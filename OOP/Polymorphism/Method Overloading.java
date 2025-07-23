///Masum
import java.io.*;
import java.util.Scanner;

/*
   Polymorphism
   Method overloading
*/

class Overloading {
    String s;
    int a;
    double d;

    ///Method 1
    String show (String s , String t) {
        this.s = s;

        String p = s + " " + t;
        return p;
    }

    ///Method 2
    int show (int age , String s) {
        this.s = s;
        System.out.println("My name IS " + s);

        return age;
    }

    void show (String s , String t , int a , double d) {
        this.s = s;
        this.a = a;
        this.d = d;

        System.out.println("My Name IS " + s + " " + t + '.');
        System.out.println("my Age " + a);
        System.out.println("and my Salary IS " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Overloading info = new Overloading();

        System.out.println("Enter an Type (1 , 2 or 3) : ");
        int type = input.nextInt();

        if(type == 1) {

            String p = info.show("Ishraq" , "Hussain");
            System.out.println(p);

        } else if(type == 2) {

            int n = info.show(25,"Ishraq");
            System.out.println(n);

        } else {
            info.show("Ishraq" , "Husain" , 25 , 10.00);
        }
    }
}
