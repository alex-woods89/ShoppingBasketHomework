import org.junit.Before;
import org.junit.Test;
import shoppingbasket.ShoppingBasket;
import shoppingbasket.discounts.LoyaltyCard;
import shoppingbasket.items.Carrot;

import static org.junit.Assert.assertEquals;

public class LoyaltyCardTest {

    LoyaltyCard loyaltyCard;
    ShoppingBasket shoppingBasket;
    Carrot carrot;

    @Before
    public void before(){
        loyaltyCard = new LoyaltyCard();
        shoppingBasket = new ShoppingBasket();
        carrot = new Carrot("carrot", 100);
    }

    @Test
    public void canApplyDiscountToShoppingBasket(){
        shoppingBasket.addItem(carrot);
        assertEquals(98, loyaltyCard.discount(shoppingBasket), 0.01);
    }
}
