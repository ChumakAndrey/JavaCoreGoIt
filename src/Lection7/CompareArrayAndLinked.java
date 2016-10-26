package Lection7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 26.10.2016.
 */
public class CompareArrayAndLinked {


    public static void compare() {
        List<String>  stringArrayList = new ArrayList<>();
        List<Integer> intArrayList = new ArrayList<>();

        List<String> stringLinkedList = new LinkedList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        long firstCompare;
        long secondCompare;

        long startString = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            stringArrayList.add("AbraCadabra");
        }

    long finishString = System.currentTimeMillis();

        firstCompare = finishString - startString;

        startString = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            stringLinkedList.add("AbraCadabra");
        }

        finishString = System.currentTimeMillis();
        secondCompare = finishString - startString;
        System.out.println("ArrayList.add " + firstCompare);
        System.out.println("LinkedList.add " + secondCompare);


}

}
