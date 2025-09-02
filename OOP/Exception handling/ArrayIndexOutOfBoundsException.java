package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int[] array = new int[10];
            System.out.println(array[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception" + e);

            System.out.println("Please try to be in fixed index");
        }
    }
}

