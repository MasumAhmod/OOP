
package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a, b;
            System.out.println("Enter a number : ");
            a = input.nextInt();

            System.out.println("Enter another number : ");
            b = input.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exceptin : " + e);
            System.out.println("Second number can't be 0");
        }
    }
}

