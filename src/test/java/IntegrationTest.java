import org.junit.Before;
import org.junit.Test;
import shoppingbasket.ShoppingBasket;
import shoppingbasket.discounts.Bogof;
import shoppingbasket.discounts.LoyaltyCard;
import shoppingbasket.discounts.PercentageOff;
import shoppingbasket.items.Carrot;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    Bogof bogof;
    LoyaltyCard loyaltyCard;
    PercentageOff percentageOff;
    ShoppingBasket shoppingBasket;
    Carrot carrot;

    @Before
    public void before(){
        bogof = new Bogof();
        loyaltyCard = new LoyaltyCard();
        percentageOff = new PercentageOff();
        carrot = new Carrot("carrot", 100);
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void canUseMultipleDiscounts(){
        shoppingBasket.addItem(carrot);
        shoppingBasket.addItem(carrot);
        bogof.discount(shoppingBasket);
        loyaltyCard.discount(shoppingBasket);
        percentageOff.discount(shoppingBasket);
        assertEquals(88.2, shoppingBasket.getTotalValue(), 0.01);

    }

}
