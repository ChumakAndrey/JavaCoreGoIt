package Lection2;

/**
 * Created by Администратор on 24.08.2016.
 */
public class MakeArray {
    public static int[] newArray(int k) {
            int[] array = new int[k];
            for (int i=0; i< array.length; i++){
                array[i] = (-100)+(int)(Math.random()*(100-(-100))+1);
            }
        return array;
        }

    public static double[] newDoubleArray(int k) {
        double[] array = new double[k];
        for (int i=0; i< array.length; i++){
            array[i] = (-100)+(double)(Math.random()*(100-(-100))+1);
        }
        return array;
    }
    }


