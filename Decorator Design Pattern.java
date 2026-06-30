
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



package com.mycompany.mavenproject1;

/**
 *
 * @author Masum
 */
public interface Coffee {
    String getDescription();
    double getCost();
}



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




