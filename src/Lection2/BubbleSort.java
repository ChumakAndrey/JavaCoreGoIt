package Lection2;
import java.util.Arrays;
/**
 * Created by Администратор on 24.08.2016.
 */
public class BubbleSort {
    static void bubbleSort(int[] num) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1])
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(num));
    }

}
