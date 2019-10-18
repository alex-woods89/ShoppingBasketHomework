import org.junit.Before;
import org.junit.Test;
import shoppingbasket.ShoppingBasket;
import shoppingbasket.discounts.PercentageOff;
import shoppingbasket.items.Carrot;

import static org.junit.Assert.assertEquals;

public class PercentageOffTest {

    ShoppingBasket shoppingBasket;
    Carrot carrot;
    PercentageOff percentageOff;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        carrot = new Carrot("Carrot", 100);
        percentageOff = new PercentageOff();
    }

    @Test
    public void canUsePercentageOff(){
        shoppingBasket.addItem(carrot);
        assertEquals(90, percentageOff.discount(shoppingBasket), 0.01);
    }
}
