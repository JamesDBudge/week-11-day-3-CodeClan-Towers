import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int nightRate;
    private boolean booked;
    private int numberOfNights;

    public Bedroom(int roomNumber, int capacity, String type, int nightRate, boolean booked){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.nightRate = nightRate;
        this.booked = booked;
        this.numberOfNights = numberOfNights;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public boolean checkRoomOccupied() {
        return guests.size() > 0;
    }

    public int countGuestsInRoom() {
        return guests.size();
    }

    public void addGuestToRoom(Guest guest) {
        guests.add(guest);

    }

    public void checkOutGuests() {
        this.guests.clear();
        this.booked = false;
    }

    public void bookRoom(int numberOfNights){
        this.booked = true;
        this.numberOfNights = numberOfNights;
    }

    public boolean checkRoomBooked(){
        return this.booked;
    }

    public int checkNightsBooked() {
        return this.numberOfNights;
    }

    public int totalCostForBooking() {
        return this.numberOfNights * this.nightRate;
    }
}
