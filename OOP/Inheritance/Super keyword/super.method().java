/// Masum
import java.io.*;
import java.util.Scanner;

/*
  super.method()
  Call parent class's method if overridden
*/

class A {
    void Call() {
        System.out.println("Haa Beta");
    }
}

class B extends A {
    void Call() {
        System.out.println("Hello Papa");
        super.Call();  // Calls parent method

        System.out.println("Uss Cycle ki....");
    }
}

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        B object = new B();
        object.Call();
    }
}

