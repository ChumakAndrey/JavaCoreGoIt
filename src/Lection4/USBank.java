package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class USBank extends Bank {
    Currency currency;
    int summ;

    public USBank(Currency currency, int summ) {
        this.currency = currency;
        this.summ = summ;
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency.equals("USD"))
             return 1000;
            else return 1200;
    }

    @Override
    int getLimitOfFunding() {
        if (currency.equals("USD"))
                return 0;
                else return 10000;
    }

    @Override
    int getMonthRate() {
        if (currency.equals("USD"))
                return summ/100;
                else return summ*2/100;
    }

    @Override
    int getCommision() {

        if (currency.equals("USD")) {
            if (summ < 1000) {
                return summ * 5 / 100;
            } else return summ * 7 / 100;
        } else  {
            if (summ < 1000) {
                return summ * 6 / 100;
            } else return  summ * 8 / 100;
        }
    }
}
