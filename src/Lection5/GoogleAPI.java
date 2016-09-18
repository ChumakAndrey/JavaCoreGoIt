package Lection5;

import java.util.Date;

/**
 * Created by Администратор on 15.09.2016.
 */
public class GoogleAPI implements API {
    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(159123, 400, 2, new Date(), "Nora", "Minsk");
        Room room2 = new Room(159234, 700, 1, new Date(), "Sota", "Chernigov");
        Room room3 = new Room(159345, 600, 3, new Date(), "Tort", "Kyiv");
        Room room4 = new Room(159456, 1000, 2, new Date(), "Centr", "Kharkov");
        Room room5 = new Room(159567, 1600, 4, new Date(), "Lviv", "Lviv");

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
        Room[] getAll;
        getAll = rooms;
        return getAll;
    }
}
