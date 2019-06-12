import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();



    }


    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);

    }


    public int checkOccupancy(Bedroom bedroom) {
        return bedroom.countGuestsInRoom();
    }

    public void addGuestInRoom(Guest guest, Bedroom bedroom) {
        bedroom.addGuestToRoom(guest);
    }

    public void checkOutGuestFromRoom(Bedroom bedroom) {
        bedroom.checkOutGuests();
    }


    public void bookRoom(Bedroom bedroom, int numberOfNights) {

        bedroom.bookRoom(numberOfNights);


    }
}
