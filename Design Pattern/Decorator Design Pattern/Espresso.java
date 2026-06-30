package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public class Espresso implements Coffee{
    @Override
    public double getCost() {
        return 100;
    }
    
    @Override
    public String getDescription() {
        return Espresso;
    }
}
