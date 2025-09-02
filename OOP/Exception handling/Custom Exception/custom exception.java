///MAsum
import java.io.*;
import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        age = input.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Custom Exception: Age must be 18+");
            }
            System.out.println("You can apply for driving license.");
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
