import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



    public class ConferenceRoomTest {

        ConferenceRoom conferenceRoom1;
        ConferenceRoom conferenceRoom2;
        ConferenceRoom conferenceRoom3;
        Guest guest1;
        Guest guest2;
        Guest guest3;

        @Before
        public void before(){
            conferenceRoom1 = new ConferenceRoom("Marchmont", 2);
            conferenceRoom2 = new ConferenceRoom("Cockburn", 3);
            conferenceRoom3 = new ConferenceRoom("Fettes", 4);

            guest1 = new Guest("Peter");
            guest2 = new Guest("Paul");
            guest3 = new Guest("Mary");
        }

        @Test
        public void canGetRoomName(){
            assertEquals("Cockburn", conferenceRoom2.getRoomName());
        }

        @Test
        public void canGetRoomCapacity(){
            assertEquals(4, conferenceRoom3.getRoomCapacity());
        }

        @Test
        public void checkRoomStartsUnoccupied(){
            assertEquals(false, conferenceRoom3.checkRoomOccupied());
        }

        @Test
        public void canCountGuestsInRoom() {
            assertEquals(0, conferenceRoom2.countGuestsInRoom());
        }

        @Test
        public void canAddGuestToRoom(){
            conferenceRoom2.addGuestToRoom(guest1);
            conferenceRoom2.addGuestToRoom(guest2);
            assertEquals(2, conferenceRoom2.countGuestsInRoom());
        }

        @Test
        public void canCheckOutGuests(){
            conferenceRoom3.addGuestToRoom(guest1);
            conferenceRoom3.checkOutGuests();
            assertEquals(0, conferenceRoom3.countGuestsInRoom());
        }
}
