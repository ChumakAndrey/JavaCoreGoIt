package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class USBank extends Bank {
    int summ;
    Currency currency;
    public USBank(int summ, Currency currency) {
        this.summ = summ;
        this.currency = currency;
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (currency){
            case USD:
             return 1000;
            case  EUR:
                return 1200;
        }
    }

    @Override
    int getLimitOfFunding() {
        switch (currency){
            case USD:
                return 0;
            case  EUR:
                return 10000;
        }
    }

    @Override
    int getMonthRate() {
        switch (currency){
            case USD:
                return summ/100;
            case  EUR:
                return summ*2/100;
        }

    }

    @Override
    int getCommision(int summ) {
        switch (currency){
            case USD:
                if (summ<1000){
                    return summ*5/100;
                }
                else return summ*7/100;

            case  EUR:
                if (summ<1000)
                    return summ*6/100;
                else return summ*8/100;
        }
    }
}
