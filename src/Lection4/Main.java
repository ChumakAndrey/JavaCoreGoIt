package Lection4;

/**
 * Created by Администратор on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(Currency.EUR, 1500);
        System.out.println(usBank.getCommision());

        System.out.println(usBank.getLimitOfFunding());

    }
}
