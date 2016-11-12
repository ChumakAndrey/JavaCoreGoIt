package Lection10;

/**
 * Created by Администратор on 12.11.2016.
 */
public class WithFAndGMethods {
    public static void f(){
        System.out.println("In f() method");
        throw new ArithmeticException("ArithmeticException"+ "/n" + "in f()");
    }

    public static void g(){
        System.out.println("In g() method");
        try {
            f();
        } catch (ArithmeticException ari) {
            System.out.print(ari);
            throw new ClassCastException("in g()");
        }
    }


}
