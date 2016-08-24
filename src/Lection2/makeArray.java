package Lection2;

/**
 * Created by Администратор on 24.08.2016.
 */
public class makeArray {
    public static int[] makeArray (int size){
        int[] array = new int[size];
        for (int i=0; i< array.length; i++){
            array[i] = (-100)+(int)(Math.random()*(100-(-100))+1);
        }

        return array;
    }
}
