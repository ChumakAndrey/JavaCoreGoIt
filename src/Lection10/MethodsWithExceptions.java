package Lection10;

/**
 * Created by Администратор on 12.11.2016.
 */
public class MethodsWithExceptions {
    public static void withEx() throws MyException {
        System.out.println("In withEx method");
        throw new MyException("MyException thrown");
    }
}
