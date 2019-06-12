import java.util.ArrayList;


public class ConferenceRoom {

    private String roomName;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String roomName, int capacity){
        this.roomName = roomName;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getRoomName(){
        return this.roomName;
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
    }
}
