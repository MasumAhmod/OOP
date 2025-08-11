///Masum
import java.io.*;
import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();

    //default method
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vehicle v = new Car();
        v.start();
        v.honk();
        v.stop();
    }
}
