import org.junit.Before;
import org.junit.Test;
import shoppingbasket.ShoppingBasket;
import shoppingbasket.discounts.Bogof;
import shoppingbasket.items.Carrot;
import shoppingbasket.items.Onion;

import static org.junit.Assert.assertEquals;

public class BogofTest {

    Bogof bogof;
    ShoppingBasket shoppingBasket;
    Carrot carrot;
    Onion onion;

    @Before
    public void before(){
        bogof = new Bogof();
        shoppingBasket = new ShoppingBasket();
        carrot = new Carrot("carrot", 1);
        onion = new Onion("onion", 1);
    }

    @Test
    public void canBogof(){
        shoppingBasket.addItem(carrot);
        shoppingBasket.addItem(carrot);
        shoppingBasket.addItem(onion);
        shoppingBasket.addItem(onion);

        assertEquals(2, bogof.discount(shoppingBasket), 0.01);
    }
}
