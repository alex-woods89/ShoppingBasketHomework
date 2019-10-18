package shoppingbasket.discounts;

import shoppingbasket.ShoppingBasket;

public class LoyaltyCard implements IDiscount {

    LoyaltyCard loyaltyCard;
    ShoppingBasket shoppingBasket;

    public LoyaltyCard(){ }

    public double discount(ShoppingBasket shoppingBasket){
       return shoppingBasket.getTotalValue() * 0.98;
    }
}
