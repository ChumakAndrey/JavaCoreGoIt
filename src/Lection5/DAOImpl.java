package Lection5;

/**
 * Created by Администратор on 15.09.2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room " + room + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room " + room + " deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room " + room + " updated");
        return room;
    }

    @Override
    public Room findById(long id) {

        return null;
    }
}
