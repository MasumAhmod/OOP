///Masum
import java.io.*;

class Case {
    String t = "abcd" , p;
    int a = 1 , b = 2 , c = 3, d = 4;

    /// Constructor
    Case(String s , int n , String p) {

        this.p = p;

        System.out.println("My Name is " + s + ".");
        System.out.println("And My age is " + n + ".");

        System.out.println("My Univarsity Name is : " + p);
        System.out.println("i've learn " + t + " and " + a + b + c + d + " From my Univarsity");
    }
}

public class Main {
    public static void main(String[] args) {
        Case MyInfo = new Case("Masum" , 22 , "Metropalitan Univarsity");
    }
}


