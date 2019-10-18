import org.junit.Before;
import org.junit.Test;
import shoppingbasket.items.Carrot;

import static org.junit.Assert.assertEquals;

public class CarrotTest {

    Carrot carrot;

    @Before
    public void before(){
        carrot = new Carrot("carrot", 0.5);
    }

    @Test
    public void canGetName(){
        assertEquals("carrot", carrot.getName());
    }

    @Test
    public void canGetValue(){
        assertEquals(0.5, carrot.getValue(), 0.01);
    }
}
