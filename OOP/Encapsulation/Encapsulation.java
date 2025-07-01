/// Masum
import java.io.*;
import java.util.Scanner;

/*
  Encapsulation
  Hiding Data
*/

class Person {
    private String fullName;

    // Setter for single name
    public void setName(String name) {
        this.fullName = name;
    }

    // Setter for first name and last name
    public void setName(String FirstName, String LastName) {
        this.fullName = FirstName + " " + LastName;
    }

    // Getter
    public String getName() {
        return fullName;
    }
}

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // single name
        Person p1 = new Person();
        p1.setName("Masum");
        System.out.println("Full Name: " + p1.getName());

        // separate names and merge it
        Person p2 = new Person();
        p2.setName("Masum", "Ahmed");
        System.out.println("Full Name: " + p2.getName());
    }
}

