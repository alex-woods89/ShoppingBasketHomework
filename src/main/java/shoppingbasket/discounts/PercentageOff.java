package shoppingbasket.discounts;

import shoppingbasket.ShoppingBasket;

public class PercentageOff implements IDiscount{

    ShoppingBasket shoppingBasket;
    PercentageOff percentageOff;


    public PercentageOff(){}

    public double discount(ShoppingBasket shoppingBasket){
        double total = shoppingBasket.getTotalValue();
        if(total > 20){
           return total * 0.9;
        }
        return total;
    }
}
