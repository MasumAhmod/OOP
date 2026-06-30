package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee c) {
        super(c);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + , Sugar;
    }
}
