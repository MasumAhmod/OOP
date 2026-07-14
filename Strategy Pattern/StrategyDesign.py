
package com.mycompany.strategydesign;

/**
 *
 * @author Masum
 */
public class StrategyDesign {

    public static void main(String[] args) {
        Payment_context context = new Payment_context(new COD());
        context.placeOrder(1000);
    }
}

