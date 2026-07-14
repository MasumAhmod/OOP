
package com.mycompany.strategydesign;

/**
 *
 * @author Masum
 */
public class CardPayment implements Payment_strategy{

    @Override
    public void makePayment(int amount) {
        System.out.println(Payment Succesfull via Card + amount);
    }
    
}
