import org.junit.Before;
import org.junit.Test;
import shoppingbasket.items.Onion;

import static org.junit.Assert.assertEquals;

public class OnionTest {

    Onion onion;

    @Before
    public void before(){
        onion = new Onion("onion", 0.3);
    }

    @Test
    public void canGetName(){
        assertEquals("onion", onion.getName());
    }

    @Test
    public void canGetValue(){
        assertEquals(0.3, onion.getValue(), 0.01);
    }
}
