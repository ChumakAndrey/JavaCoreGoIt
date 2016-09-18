package Lection5;


import java.util.Date;

/**
 * Created by Администратор on 15.09.2016.
 */
public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(123123, 500, 1, new Date(), "Gloria", "Chelyabinsk");
        rooms[1] = new Room(234234, 700, 1, new Date(), "Vest", "Sumy");
        rooms[2] = new Room(345345, 600, 2, new Date(), "Mir", "Kyiv");
        rooms[3]  = new Room(456456, 1500, 2, new Date(), "Palace", "Kharkov");
        rooms[4]  = new Room(789789, 900, 3, new Date(), "Gloria", "Lviv");

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
        Room[] getAll;
        getAll = rooms;
        return getAll;
    }
}
