package Lection2.Task1;

import Lection6.ArraysUtils;

import java.util.Arrays;


public class Task1 {

     public static void main(String[] args) {
        int [] array1 = Lection2.MakeArray.newArray(10);
        //double [] array2 = Lection2.MakeArray.newDoubleArray(10);

       System.out.println(Arrays.toString(array1));
        System.out.println("Сумма равна " + ArraysUtils.arraysSum(array1));
        System.out.println("Минимальное значение равно " + ArraysUtils.min(array1));
        System.out.println("Максинмальное значение равно " + ArraysUtils.max(array1));
        System.out.println("Макс.позитивное значение равно " + ArraysUtils.maxPositive(array1));
        System.out.println("Умножение всех элементов равно " + ArraysUtils.multiplication(array1));
        System.out.println("Деление по модулю равно " + ArraysUtils.modulus(array1));
        System.out.println("Второе по величине = " + ArraysUtils.secondLargest(array1));

        //System.out.println(Arrays.toString(array2));
        //System.out.println("Сумма равна " + t1.arraysSum(array2));
        //System.out.println("Минимальное значение равно " + t1.min(array2));
        //System.out.println("Максинмальное значение равно " + t1.max(array2));
        //System.out.println("Макс.позитивное значение равно " + t1.maxPositive(array2));
        //System.out.println("Умножение всех элементов равно " + t1.multiplication(array2));
        //System.out.println("Деление по модулю равно " + t1.modulus(array2));
        //System.out.println("Второе по величине = " + t1.secondLargest(array2));
            }

   /* public int arraysSum(int[]array){
        int sum=0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    public double arraysSum(double[]array){
        double sum=0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }

    public int min(int []array) {
        int min = array[0];
        for (int x = 0; x < array.length; x++) {
            if (min > array[x]){
                min = array[x];
            }
            x++;
        }
        return min;
    }

    public double min(double []array) {
        double min = 0;
        for (int x = 0; x < array.length; x++) {
            if (min > array[x]){
                min = array[x];
            }
            x++;
        }
        return min;
    }

    public int max(int []array) {
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

    public double max(double []array) {
        double max = 0;
        int x = 0;
        while (x < array.length) {
            if (max < array[x]){
                max = array[x];
            }
            x++;
        }
        return max;
    }

    public int maxPositive (int []array) {
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

    public double maxPositive (double []array) {
        double maxPositive=0;
        int x = 0;
        while (x < array.length) {
            if(maxPositive < array[x] && array[x] >= 0){
                maxPositive = array[x];
            }
            x++;
        }
        return maxPositive;
    }

    public  int multiplication (int []array) {
        int mult=1;
        int x = 0;
        while (x < array.length) {
            mult *= array[x];
            x++;
        }
        return mult;
    }

    public  double multiplication (double []array) {
        double mult=1;
        int x = 0;
        while (x < array.length) {
            mult *= array[x];
            x++;
        }
        return mult;
    }

    public  int modulus (int []array) {
        int modulus;
        modulus = array[0]%array[array.length-1];
        return modulus;
    }

    public double modulus (double []array) {
        double modulus;
        modulus = array[0]%array[array.length-1];
        return modulus;
    }

   /* public int secondLargest (int []array) {
        int preMax = 0;
        BubbleSort(array);
        preMax = array[array.length-2];
        return preMax;
    }

    public int secondLargest (int []array) {
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

    public double secondLargest (double []array) {
        double preMax = 0;
        BubbleSort(array);
        preMax = array[array.length-2];
        return preMax;
    }*/
}