
package com.mycompany.strategydesign;

/**
 *
 * @author Masum
 */
public class Payment_context {
    private Payment_strategy strategy;
    Payment_context(Payment_strategy strategy) {
        this.strategy = strategy;
    }
    
    void placeOrder(int amount) {
        strategy.makePayment(amount);
    }
}

