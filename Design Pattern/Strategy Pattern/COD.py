package com.mycompany.strategydesign;

/**
 *
 * @author Masum
 */
public class COD implements Payment_strategy{

    @Override
    public void makePayment(int amount) {
        System.out.println(Payment Succesfull via COD + amount);
    }
    
}
