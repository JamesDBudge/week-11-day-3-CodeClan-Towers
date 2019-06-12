import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2, "single", 10, false);
        bedroom2 = new Bedroom(2, 3, "double", 20, false);
        bedroom3 = new Bedroom(3, 4, "suite", 30, false);

        guest1 = new Guest("Peter");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Mary");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(2, bedroom2.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(4, bedroom3.getRoomCapacity());
    }

    @Test
    public void checkRoomStartsUnoccupied(){
        assertEquals(false, bedroom3.checkRoomOccupied());
    }

    @Test
    public void canCountGuestsInRoom() {
        assertEquals(0, bedroom2.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom2.addGuestToRoom(guest1);
        bedroom2.addGuestToRoom(guest2);
        assertEquals(2, bedroom2.countGuestsInRoom());
    }

    @Test
    public void canCheckOutGuests(){
        bedroom3.addGuestToRoom(guest1);
        bedroom3.checkOutGuests();
        assertEquals(0, bedroom3.countGuestsInRoom());
    }
}
