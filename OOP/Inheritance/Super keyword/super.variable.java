/// Masum
import java.io.*;
import java.util.Scanner;

/*
  super.variable
  Access parent class's variable if child has same name
*/

class A {
    String name = "Parent";
}

class B extends A {
    String name = "Child";

    void show() {
        System.out.println(name);        // Child
        System.out.println(super.name);  // Parent
    }
}

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        B object = new B();
        object.show();
    }
}

