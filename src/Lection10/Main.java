package Lection10;


import static Lection10.WithFAndGMethods.g;

/**
 * Created by Администратор on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Task #1
       /* try{
            System.out.println("In try block");
            throw new Exception();
        }
        catch (Exception ex) {
            System.err.println("In catch block");
        }*/
////////////////////////////////////////////////////
        //Task #2
       /* try {
            MethodsWithExceptions.withEx();
        }
        catch (MyException ex) {
            ex.printStackTrace(System.err);
        }*/
////////////////////////////////////////////////////
        //Task #3
        /*try{
            String string = null;
            System.out.println(string.length());
        }
        catch (NullPointerException np){
            System.out.println("Catched");
            np.printStackTrace(System.err);
        }*/
///////////////////////////////////////////////////
        //Task #4
        g();


    }
}
