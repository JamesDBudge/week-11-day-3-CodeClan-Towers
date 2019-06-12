import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    Guest guest1;
    Guest guest2;
    Guest guest3;

    Booking booking1;


    @Before
    public void before(){

        hotel = new Hotel();
        conferenceRoom1 = new ConferenceRoom("Marchmont", 2);
        conferenceRoom2 = new ConferenceRoom("Cockburn", 3);
        conferenceRoom3 = new ConferenceRoom("Fettes", 4);

        bedroom1 = new Bedroom(1, 2, "single", 10, false);
        bedroom2 = new Bedroom(2, 3, "double", 20, false);
        bedroom3 = new Bedroom(3, 4, "suite", 30, false);

        guest1 = new Guest("Peter");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Mary");

        booking1 = new Booking(bedroom1, 5);
    }

    @Test
    public void canCountBedRooms(){
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addGuestInRoom(guest2, bedroom2);
        assertEquals(1, hotel.checkOccupancy(bedroom2));
    }

    @Test
    public void canRemoveGuestFromRoom(){
        hotel.addGuestInRoom(guest2, bedroom2);
        hotel.addGuestInRoom(guest3, bedroom2);
        hotel.checkOutGuestFromRoom(bedroom2);
        assertEquals(0, hotel.checkOccupancy(bedroom2));

    }
}
