/// Masum
import java.io.*;
import java.util.Scanner;

/*
  Encapsulation
  Hiding Data
*/

public class Teacher {
    private String name, address;
    private int age;
    private double salary;     

    // Constructor
    public Teacher(String name, String address, int age, double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overloaded setter (two names)
    public void setName(String name1, String name2) {
        this.name = name1 + " " + name2;
    }

    // Other Getters & Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Teacher t = new Teacher("Donald Trump",
                "Washington DC",
                79, 1000);
        
        t.setName("George Bush");
        System.out.println(t.getName());

        t.setName("Mohd.", "Yunus");
        System.out.println(t.getName());
    }
}
