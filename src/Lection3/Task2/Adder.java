package Lection3.Task2;

/**
 * Created by Администратор on 03.09.2016.
 */
public class Adder extends Arithmetic {
    boolean check (Integer a, Integer b) {
        if (a>=b) return true;
        else return false;
    }

    public static void main(String[] args) {
        Adder add = new Adder();
        System.out.println(add.check(26 , 9));
    }
}
