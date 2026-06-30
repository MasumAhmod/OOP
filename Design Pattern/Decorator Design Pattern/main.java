package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Coffee c = new Machine_Coffee();
        
        c = new MilkDecorator(c);
        c = new SugarDecorator(c);
        
        System.out.println(c.getDescription() +   + c.getCost() + , BDT);
    }
}
