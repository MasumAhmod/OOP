package com.mycompany.strategydesign;

/**
 *
 * @author Masum
 */
public class MobileBanking implements Payment_strategy{

    @Override
    public void makePayment(int amount) {
        System.out.println(Payment successfull via Bkash + amount);
    }
    
}
