package FinalProgectGroup5;

import java.util.Random;

/**
 * Created by Администратор on 30.10.2016.
 */
public class Room {
    private boolean isEmpty;
    private int persons;
    private int price;
    private long id;
    private String hotelName;
    private String cityName;

    public Room(int persons, int price) {
        this.persons = persons;
        this.price = price;
        isEmpty = true;
        id = this.hashCode();
        isEmpty = true;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        Random random = new Random(47);
        int result = random.nextInt(1000);
        result = 31 * result + price / persons;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return  false;
        Room room = (Room) obj;
        if (price != room.price) return false;
        if (!cityName.equals(room.getCityName())) return false;
        if (!hotelName.equals(room.getHotelName())) return false;
        return persons==room.persons;
    }

    @Override
    public String toString() {
        return id + "Room for " + persons + "persons. Price = " + price;
    }
}
