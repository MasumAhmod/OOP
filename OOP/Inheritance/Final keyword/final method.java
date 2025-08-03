///Masum
import java.io.*;
import java.util.Scanner;

/*
finalize a method prevents ovverriden by subclasse.

*/

class Classs {
    double salary = 56000;

    final void show () {
        System.out.print("Salary is : " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Classs s = new Classs();
        s.show();
    }
}
