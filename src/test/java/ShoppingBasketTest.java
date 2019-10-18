import org.junit.Before;
import org.junit.Test;
import shoppingbasket.ShoppingBasket;
import shoppingbasket.items.Carrot;
import shoppingbasket.items.Item;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item carrot;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        carrot = new Carrot("carrot", 0.3);
    }

    @Test
    public void shoppingBasketStartsEmpty(){
        assertEquals(0, shoppingBasket.getItemsCount());
    }

    @Test
    public void canAddItemsToShoppingBasket(){
        shoppingBasket.addItem(carrot);
        assertEquals(1, shoppingBasket.getItemsCount());
    }

    @Test
    public void canRemoveItemsFromShoppingBasket(){
        shoppingBasket.addItem(carrot);
        shoppingBasket.addItem(carrot);
        shoppingBasket.removeItem(0);
        assertEquals(1, shoppingBasket.getItemsCount());
    }

    @Test
    public void canRemoveAllItemsFromShoppingBasket(){
        shoppingBasket.addItem(carrot);
        shoppingBasket.addItem(carrot);
        shoppingBasket.removeAllItems();
        assertEquals(0, shoppingBasket.getItemsCount());

    }
}
