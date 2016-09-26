package Lection6;

/**
 * Created by Администратор on 26.09.2016.
 */
public final class ArraysUtils {
    public static final int arraysSum(int[]array){
        int sum=0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    public static final int min(int []array) {
        int min = array[0];
        for (int x = 0; x < array.length; x++) {
            if (min > array[x]){
                min = array[x];
            }
            x++;
        }
        return min;
    }

    public static final int max(int []array) {
        int max = array[0];
        int x = 0;
        while (x < array.length) {
            if (max < array[x]){
                max = array[x];
            }
            x++;
        }
        return max;
    }

    public static final int maxPositive (int []array) {
        int maxPositive=array[0];
        int x = 0;
        while (x < array.length) {
            if(maxPositive < array[x] && array[x] >= 0){
                maxPositive = array[x];
            }
            x++;
        }
        return maxPositive;
    }

    public static final int multiplication (int []array) {
        int mult=1;
        int x = 0;
        while (x < array.length) {
            mult *= array[x];
            x++;
        }
        return mult;
    }

    public static final  int modulus (int []array) {
        int modulus;
        modulus = array[0]%array[array.length-1];
        return modulus;
    }

    public static final int secondLargest (int []array) {
        boolean flag = true;
        int temp;
        int secondLargest;

        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
        secondLargest = array[array.length-2];
        return secondLargest;
    }

    static final int[] reverse(int[] array){return array;}
    static final int[] findEvenElements(int[] array){return array;}

}
