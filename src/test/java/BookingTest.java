import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Hotel hotel;
    Bedroom bedroom;


    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;



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


        booking1 = new Booking(bedroom1, 5);

    }

    @Test
    public void checkForBooking() {
        hotel.bookRoom(bedroom1, 5);
        assertEquals(true, bedroom1.checkRoomBooked() );
        assertEquals(5, bedroom1.checkNightsBooked());
        assertEquals(50, bedroom1.totalCostForBooking());
    }



}
