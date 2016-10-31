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

    public Room(int persons, int price) {
        this.persons = persons;
        this.price = price;
        isEmpty = true;
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
        return persons==room.persons;
    }
}
