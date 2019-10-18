package shoppingbasket.discounts;

import shoppingbasket.ShoppingBasket;
import shoppingbasket.items.Item;

public class Bogof {

    Bogof bogof;
    ShoppingBasket shoppingBasket;

    public double discount(ShoppingBasket shoppingBasket) {
        double total = 0;
        for(Item item : shoppingBasket.createUniqueArray()){
            total += item.getValue();
        }
        return total;
    }
}
