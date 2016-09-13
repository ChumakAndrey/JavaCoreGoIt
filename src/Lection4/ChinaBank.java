package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class ChinaBank extends Bank {

    @Override
    public String toString() {
        return "ChinaBank";
    }

    @Override
    int getLimitOfWithdrawal(Currency currency) {
        if (currency.equals("USD"))
            return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding(Currency currency) {
        if (currency.equals("USD"))
            return 10000;
        else return 5000;
    }

    @Override
    int getMonthRate(int summ, Currency currency) {
        if (currency.equals("USD"))
            return summ/100;
        else return 0;
    }

    @Override
    int getCommision(int summ, Currency currency) {
        if (currency.equals("USD")) {
            if (summ < 1000) {
                return summ * 3 / 100;
            } else return summ * 5 / 100;
        } else {
            if (summ < 1000) {
                return summ * 10 / 100;
            } else return summ * 11 / 100;
        }
    }
}
