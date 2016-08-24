package Lection2.Task1;
import java.util.Arrays;
import static Lection2.BubbleSort.bubbleSort;


public class Task1 {
    public int arraysSum(int[]array){
        int sum=0;
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

    public  int multiplication (int []array) {
        int mult=1;
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

    public int preMax (int []array) {
        int preMax = 0;
        bubbleSort(array);
        preMax = array[array.length-2];
        return preMax;
    }



    public static void main(String[] args) {
        Task1 t1 = new Task1();
        int [] array1 = Lection2.makeArray.newArray(10);


        //int[] mass = {1 , 24, -98, 97, 34, -105, -19, 8, -10, 92};
        //System.out.println(t1.arraysSum(mass));

        System.out.println(Arrays.toString(array1));
        System.out.println("Сумма равна " + t1.arraysSum(array1));
        System.out.println("Минимальное значение равно " + t1.min(array1));
        System.out.println("Максинмальное значение равно " + t1.max(array1));
        System.out.println("Макс.позитивное значение равно " + t1.maxPositive(array1));
        System.out.println("Умножение всех элементов равно " + t1.multiplication(array1));
        System.out.println("Деление по модулю равно " + t1.modulus(array1));
        System.out.println("preMax = " + t1.preMax(array1));
            }

}