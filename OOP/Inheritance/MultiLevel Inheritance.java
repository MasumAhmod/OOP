/// Masum
import java.io.*;
import java.util.Scanner;

/*
   Inheritance: (multilevel inheritance)
   1 super class and one or more sub class
*/

class A { // super class
    int a, b, c;

    void sum() {
        a = 5;
        b = 10;
        c = a + b;
        System.out.println("Sum of Two Numbers: " + c);
    }

    void sub() {
        a = 30;
        b = 15;
        c = a - b;
        System.out.println("Subtraction of Two Numbers: " + c);
    }
}

class B extends A {
    void multi() {
        a = 6;
        b = 5;
        c = a * b;
        System.out.println("Multiplication of Two Numbers: " + c);
    }

    void div() {
        a = 45;
        b = 15;
        c = a / b;
        System.out.println("Division of Two Numbers: " + c);
    }
}

class C extends B {
    void mod() {
        a = 50;
        b = 15;
        c = a % b;
        System.out.println("Mod of Two Numbers: " + c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        C calc = new C(); // create object of class C , as there stores all info of class A  and B
        calc.sum();
        calc.sub();
        calc.multi();
        calc.div();
        calc.mod();
    }
}

