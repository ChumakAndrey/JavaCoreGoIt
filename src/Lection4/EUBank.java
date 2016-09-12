package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class EUBank extends Bank {
    Currency currency;
    int summ;

    public EUBank(Currency currency, int summ) {
        this.currency = currency;
        this.summ = summ;
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency.equals("EUR"))
            return 2200;
        else return 2000;
    }

    @Override
    int getLimitOfFunding() {
        if (currency.equals("EUR"))
            return 20000;
        else return 10000;
    }

    @Override
    int getMonthRate() {
        if (currency.equals("EUR"))
            return summ/100;
        else return 0;
    }

   @Override
    int getCommision() {
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
