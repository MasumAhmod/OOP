/// Masum
import java.io.*;
import java.util.Scanner;

class DigitalWalltet {
    private String ownerName;
    private int walletId;
    private double balance;

    DigitalWalltet(String ownerName, int walletId, double balance) {
        this.ownerName = ownerName;
        this.walletId = walletId;
        this.balance = balance;
    }

    public String getOwnerName(String b) {
        return ownerName;
    }

    public int getWallet() {
        return walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setInfo(String ownerName, int walletId, double balance) {
        this.ownerName = ownerName;
        this.walletId = walletId;
        this.balance = balance;
    }

    //AdddMoney
    public void addMoney(double amount) {

        balance += amount;
        System.out.println("Successflly added "  + amount + " to " + walletId);
    }

    //sendMoney
    public void sendMoney(int walletId, double amount) {
        if(amount <= balance) {

            System.out.println("Sucessfully Sent " + amount + " to " + walletId);
            balance -= amount;
             System.out.println("Your Current Balance is: " + balance);
        } else {
            System.out.println("Error!");
        }
    }

    //Withdraw
    public void withdraw(double amount) {
        if(amount <= balance) {
            System.out.println("Sucessfully withdraw " + amount + " from " + walletId);

            balance -= amount;
            System.out.println("Your Current Balance is: " + balance);

        } else {
            System.out.println("Error!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DigitalWalltet walltet = new DigitalWalltet("Alice" , 232232 , 60.00);
        walltet.setInfo("Alice" , 3243423, 7354.30);

        walltet.withdraw(10000);
    }
}
