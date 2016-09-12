package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class ChinaBank extends Bank {
    Currency currency;
    int summ;

    public ChinaBank(Currency currency, int summ) {
        this.currency = currency;
        this.summ = summ;
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency.equals("USD"))
            return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (currency.equals("USD"))
            return 10000;
        else return 5000;
    }

    @Override
    int getMonthRate() {
        if (currency.equals("USD"))
            return summ/100;
        else return 0;
    }

    @Override
    int getCommision() {
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
