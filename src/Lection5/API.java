package Lection5;

/**
 * Created by Администратор on 15.09.2016.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city);

    Room [] getAll();
}
