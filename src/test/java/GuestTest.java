import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jim");
    }

    @Test
    public void findGuestsName(){
        assertEquals("Jim", guest.findName());

    }

}
