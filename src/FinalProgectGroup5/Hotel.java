package FinalProgectGroup5;

import java.util.Set;

/**
 * Created by Администратор on 05.11.2016.
 */
public class Hotel {
    private String city;
    private String name;
    Set<Room> rooms;

    public Hotel(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
