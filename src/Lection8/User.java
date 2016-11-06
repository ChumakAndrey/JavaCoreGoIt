package Lection8;

import java.util.Random;

/**
 * Created by Администратор on 01.11.2016.
 */
public class User {
    private long id;
    private String name;
    Random rand = new Random(47);

    public User(String name) {
        id = rand.nextInt(1000000);
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
