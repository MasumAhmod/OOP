///Masum
import java.io.*;
import java.util.Scanner;

/*
it's for const value , can't change once it innnitialized in runtime
*/

class Classs {
    final double salary = 56000;

    void show () {
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
