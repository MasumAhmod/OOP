/// Masum
import java.io.*;
import java.util.Scanner;

/*
   inheritance: (single inheritace)
   Old(existing) class extands new class
*/

class Father { ///super_class
    int age , money;
    String name;

    void eat() {
        System.out.println(name + " Eats Plao ");
    }
}

class Son extends Father { ///Sub_class
    String uniName;

    void write() {
        System.out.println(name + " Writes Fast");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Son s = new Son();
        s.name = "Bob";

        Father f =  new Father();
        s.write();
        s.eat();
        f.name = "Alice";
        f.eat();
    }
}
