/// Masum
import java.io.*;
import java.util.Scanner;

/*
 Constructor Overloading
*/

class Case {
    String s , t;
    boolean b;
    double c;

    Case(String Name , String Id , boolean f , double Cgpa) {
        s = Name;
        t = Id;
        b = f;
        c = Cgpa;
    }

    Case(String Name , String Id , boolean f) {
        s = Name;
        t = Id;
        b = f;
    }

    Case(String Name , boolean f) {
        s = Name;
        b = f;
    }

    ///Create Method for Print
    void PrintInfo() {
        System.out.println("Name : " + s);
        System.out.println("Status : " + (b ? "Valid" : "Invalid"));

        if(t != null) {
            System.out.println("ID : " + t);
        }

        if(c != 0.0) {
            System.out.println("Cgpa : " + c);
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Info ->:");

        Case info_1 = new Case("Alice" , "123-456-789" , true , 4.00);
        Case info_2 = new Case("Bob" , "123-456-987" , true);
        Case info_3 = new Case("Charlie" , true);

        System.out.println("Select Type -> 1 , 2 or 3: ");
        int type;
        type = input.nextInt();

        if(type == 1) {
            info_1.PrintInfo();
        } else if(type == 2) {
            info_2.PrintInfo();
        } else {
            info_3.PrintInfo();
        }
    }
}

