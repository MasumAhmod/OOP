///MAsum
import java.io.*;
import java.util.Scanner;

class negValueException extends Exception {

    public negValueException(String msg) {
        super(msg);
    }
}


public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean check = true;
        double height = 0, weight = 0;

        try {
            System.out.println("Enter Your Height in Meters: ");
            height = input.nextDouble();

            System.out.println("Enter Your Weight in KG: ");
            weight = input.nextDouble();

            if (height <= 0 || weight <= 0) {
                check = false;
                throw new negValueException("Height and weight must be greater than zero");
            }

        } catch (negValueException ex) {
            System.out.println("Exception: " + ex.getMessage());

        } finally {
            if (check) {
                double BMI = weight / (height * height);
                System.out.printf("Your BMI is: %.2f%n", BMI);
            }
        }
    }
}

