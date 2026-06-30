package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public class Machine_Coffee implements Coffee{
    @Override
    public double getCost() {
        return 20;
    }
    
    @Override
    public String getDescription() {
        return Macine Coffee;
    }
}
