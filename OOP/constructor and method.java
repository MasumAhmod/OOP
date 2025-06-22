import java.io.*;
import java.util.Scanner;

class Case {
    String s;
    String p;

    /// Constructor
    Case(Scanner input) {
        s = input.nextLine();
        System.out.print(s + " ");

        inCase(input);
        System.out.print(p);
    }

    /// Method
    void inCase(Scanner input) {
        p = input.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Case myCase = new Case(input);
    }
}

