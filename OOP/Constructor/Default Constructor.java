///Masum
import java.io.*;

/*
 Default Constructor :
 where no parameter passed
*/

class Case {
    String s;
    int n;

    ///Constructer
    Case() {
        s = "Masum";
        n = 22;

        System.out.println("I'm " + s + " And My age is : " + n + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Case MyInfo = new Case();
    }
}


