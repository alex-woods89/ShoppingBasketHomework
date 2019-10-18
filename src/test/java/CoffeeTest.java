import org.junit.Before;
import org.junit.Test;
import shoppingbasket.items.Coffee;

import static org.junit.Assert.assertEquals;


public class CoffeeTest {

    Coffee coffee;

    @Before
    public void before(){
        coffee = new Coffee("Nescafe", 5.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Nescafe", coffee.getName());
    }


    @Test
    public void canGetValue(){
        assertEquals(5.0, coffee.getValue(), 0.01);
    }

}
