
package com.mycompany.mavenproject4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a, b;
            System.out.println("Enter a integer Value : ");
            a = input.nextInt();

            System.out.println("Enter another integer Value : ");
            b = input.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exceptin : " + e);

            System.out.println("Second number can't be 0");
        } catch (InputMismatchException e) {
            System.out.println("Exception : " + e);

            System.out.println("Please Follow input Format as written");
        }
    }
}

