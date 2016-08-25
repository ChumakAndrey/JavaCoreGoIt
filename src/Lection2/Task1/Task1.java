package Lection2.Task1;

import java.util.Arrays;

import static Lection2.BubbleSort.BubbleSort;


public class Task1 {

     public static void main(String[] args) {
        Task1 t1 = new Task1();
        int [] array1 = Lection2.MakeArray.newArray(10);
        double [] array2 = Lection2.MakeArray.newDoubleArray(10);

       System.out.println(Arrays.toString(array1));
        System.out.println("Сумма равна " + t1.arraysSum(array1));
        System.out.println("Минимальное значение равно " + t1.min(array1));
        System.out.println("Максинмальное значение равно " + t1.max(array1));
        System.out.println("Макс.позитивное значение равно " + t1.maxPositive(array1));
        System.out.println("Умножение всех элементов равно " + t1.multiplication(array1));
        System.out.println("Деление по модулю равно " + t1.modulus(array1));
        System.out.println("Второе по величине = " + t1.secondLargest(array1));

        System.out.println(Arrays.toString(array2));
        System.out.println("Сумма равна " + t1.arraysSum(array2));
        System.out.println("Минимальное значение равно " + t1.min(array2));
        System.out.println("Максинмальное значение равно " + t1.max(array2));
        System.out.println("Макс.позитивное значение равно " + t1.maxPositive(array2));
        System.out.println("Умножение всех элементов равно " + t1.multiplication(array2));
        System.out.println("Деление по модулю равно " + t1.modulus(array2));
        System.out.println("Второе по величине = " + t1.secondLargest(array2));
            }

    public int arraysSum(int[]array){
        int sum=0;
        int x = 0;
        while (x < array.length) {
            sum += array[x];
            x++;
        }
        return sum;
    }

    public double arraysSum(double[]array){
        double sum=0;
        int x = 0;
        while (x < array.length) {
            sum += array[x];
            x++;
        }
        return sum;
    }

    public int min(int []array) {
        int min = 0;
        int x = 0;
        while (x < array.length) {
            if (min > array[x]){
                min = array[x];
            }
            x++;
        }
        return min;
    }

    public double min(double []array) {
        double min = 0;
        int x = 0;
        while (x < array.length) {
            if (min > array[x]){
                min = array[x];
            }
            x++;
        }
        return min;
    }

    public int max(int []array) {
        int max = 0;
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
        int maxPositive=0;
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

    public int secondLargest (int []array) {
        int preMax = 0;
        BubbleSort(array);
        preMax = array[array.length-2];
        return preMax;
    }

    public double secondLargest (double []array) {
        double preMax = 0;
        BubbleSort(array);
        preMax = array[array.length-2];
        return preMax;
    }
}