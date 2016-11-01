package Lection8;


import java.util.List;

/**
 * Created by Администратор on 31.10.2016.
 */
public interface AbstractDAO <T>{
    void  save(T obj);
    void delete(T obj);
    void deleteAll(List<T> tList);
    void saveAll(List<T> tList);
    List<T> getList(List<T> tList);

}
