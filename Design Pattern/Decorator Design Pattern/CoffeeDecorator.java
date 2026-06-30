package com.mycompany.mavenproject1;

/**
 *
 * @author MAsum
 */
public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee c) {
        this.decoratedCoffee = c;
    }
    
    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }
    
    @Override
    public String getDescription(){
        return this.decoratedCoffee.getDescription();
    }
}
