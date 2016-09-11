package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal(Currency currency) {
        if (currency.equals("USD"))
             return 1000;
            else return 1200;
    }

    @Override
    int getLimitOfFunding(Currency currency) {
        if (currency.equals("USD"))
                return 0;
                else return 10000;
    }

    @Override
    int getMonthRate(int summ, Currency currency) {
        if (currency.equals("USD"))
                return summ/100;
                else return summ*2/100;
    }

    @Override
    int getCommision(int summ, Currency currency) {
        if (currency.equals("USD")) {
            if (summ < 1000) {
                return summ * 5 / 100;
            } else return summ * 7 / 100;
        } else if (currency.equals("EUR")) {
            if (summ < 1000) {
                return summ * 6 / 100;
            } else return summ * 8 / 100;
        } return 0;
    }
}
