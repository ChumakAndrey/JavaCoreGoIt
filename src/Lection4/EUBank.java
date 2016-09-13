package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class EUBank extends Bank {


    @Override
    public String toString() {
        return "EUBank";
    }

    @Override
    int getLimitOfWithdrawal(Currency currency) {
        if (currency.equals("EUR"))
            return 2200;
        else return 2000;
    }

    @Override
    int getLimitOfFunding(Currency currency) {
        if (currency.equals("EUR"))
            return 20000;
        else return 10000;
    }

    @Override
    int getMonthRate(int summ, Currency currency) {
        if (currency.equals("EUR"))
            return summ/100;
        else return 0;
    }

   @Override
    int getCommision(int summ, Currency currency) {
        if (currency.equals("EUR")) {
            if (summ < 1000) {
                return summ * 2 / 100;
           } else return summ * 4 / 100;
        } else  {
            if (summ < 1000) {
                return summ * 5 / 100;
            } else return summ * 7 / 100;
        }
    }
}
