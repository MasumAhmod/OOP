package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int[] array = null;

            System.out.println(array[7]);
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e);
        }
    }
}

