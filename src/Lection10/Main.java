package Lection10;

/**
 * Created by Администратор on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("In try block");

            throw new Exception();
        }
        catch (Exception ex) {

            System.err.println("In cath block");
        }
    }
}
