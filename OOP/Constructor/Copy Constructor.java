///Masum
import java.io.*;

/*
 Copy Constructor :
 pass object ref to the constructor
*/

class Case {
    String t;
    int n;

    Case() {
        n = 10;
        t = "OOP";

        System.out.println(t + " " + n);
    }

    ///Copy Constructor
    Case(Case ref) {
        n = ref.n;
        t = ref.t;

        System.out.println(t + " " + n);
    }
}

public class Main {
    public static void main(String[] args) {
        Case a = new Case();
        Case b = new Case(a);
    }
}


