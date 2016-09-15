package Lection5;


import java.util.Date;

/**
 * Created by Администратор on 15.09.2016.
 */
public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(123123, 500, 1, new Date(), "Gloria", "Chelyabinsk");
        Room room2 = new Room(234234, 700, 1, new Date(), "Vest", "Sumy");
        Room room3 = new Room(345345, 600, 2, new Date(), "Mir", "Kyiv");
        Room room4 = new Room(456456, 1500, 2, new Date(), "Palace", "Kharkov");
        Room room5 = new Room(789789, 900, 3, new Date(), "Gloria", "Lviv");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city) {
        Room findRoom = new Room(000, price, persons, new Date(), "Null", city);
        Room []findedRooms = new Room[5];
        for(int i=0; i<5; i++){
            if (findRoom.equals(rooms[i])) {
                findedRooms[i] = rooms[i];
            }
        }
        return findedRooms;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
