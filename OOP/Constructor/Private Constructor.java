///Masum
import java.io.*;
/*
Private Constructor:
Only accessible within the class itself.
*/

public class Case {
    String s , p;
    int n;

    /// Constructor
    private Case(String s , int n , String p) {
        this.s = s;
        this.p = p;
        this.n = n;

        System.out.println("My Name is " + s + " And I'm " + n + ".");
        System.out.println("Currently I'm Doing my BSc at " + p);
    }

    public static void main(String[] args) {
        Case MyInfo = new Case("Masum" , 22 , "Metropalitan Univarsity");
    }
}




