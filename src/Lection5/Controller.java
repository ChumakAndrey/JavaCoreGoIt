package Lection5;

/**
 * Created by Администратор on 15.09.2016.
 */
public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorApi tripAdvisorApi = new TripAdvisorApi();
        apis[1] = tripAdvisorApi;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }

    Room[] requestRooms(int price, int persons, String city){
        Room [] DB = new Room[15]; 
        int i = 0;
        
        apis[1].findRooms(price, persons, city);
        apis[3].findRooms(price, persons, city);

        for (Room room : apis[0].findRooms(price, persons, city)) {
            if (room != null) {
                DB[i] = room;
                i++;
            }            
        }

        for (Room room : apis[1].findRooms(price, persons, city)) {
            if (room != null) {
                DB[i] = room;
                i++;
            }
        }

        for (Room room : apis[2].findRooms(price, persons, city)) {
            if (room != null) {
                DB[i] = room;
                i++;
            }
        }  
        
        return DB;
    }

    Room[] check(API api1, API api2) {
        Room[] checked = new Room[5];
        Room[] apiOne = api1.getAll();
        Room[] apiTwo = api2.getAll();
        int k = 0;
        for (Room room: apiOne) {
            for (int i = 0; i < 5; i++) {
                if (room.equals(apiTwo[i])){
                    checked[k] = room;
                    k++;
            }
        }
        }
        return checked;
    }
}
