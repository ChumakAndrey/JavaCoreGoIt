package Lection8;

import java.util.List;

/**
 * Created by Администратор on 01.11.2016.
 */
public class AbstractDaoImpl<T> implements AbstractDAO {
    @Override
    public void save(Object obj) {
        System.out.println();
    }

    @Override
    public void delete(Object obj) {

    }

    @Override
    public void deleteAll(List list) {

    }

    @Override
    public void saveAll(List list) {

    }

    @Override
    public List getList(List list) {
        return null;
    }
}
