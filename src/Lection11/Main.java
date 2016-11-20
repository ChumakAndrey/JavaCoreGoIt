package Lection11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 17.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Map<String, String> map = new HashMap<>();
        map.put("1","Java");
        tasks.replacer(map);



    }

}
