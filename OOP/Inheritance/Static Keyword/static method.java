///Masum
import java.io.*;
import java.util.Scanner;

/*
do not need to create object , you can get access static method without create object
*/

class Classs {
    int n;

    static void show() {
        System.out.print("This Methodd Cannot process Non_static Variable");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Classs s = new Classs();
        s.show();
    }
}
