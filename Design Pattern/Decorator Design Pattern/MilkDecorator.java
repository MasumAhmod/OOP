package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee c) {
        super(c);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + , Milk;
    }
}

