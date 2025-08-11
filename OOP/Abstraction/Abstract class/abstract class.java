///Masum
import java.io.*;
import java.util.Scanner;

abstract class Car {
    abstract void displayDetails();
    double speed;
}

class Classs extends Car {
    String name;

    Classs() {
        this("Yamaha" , 152.00);
    }

    Classs(String name , double speed) {
        this.name = name;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println(name + " Can Run With Speed " +  speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Classs s = new Classs();
        s.displayDetails();
    }
}
