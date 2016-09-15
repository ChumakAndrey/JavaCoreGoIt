package Lection4;

/**
 * Created by Администратор on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank();
        Bank euBank = new EUBank();
        Bank chinaBank = new ChinaBank();
        BankSystemImpl impl = new BankSystemImpl();


        User user1 = new User("user1", 1000, 12, "Company1", 100, usBank);
        User user2 = new User("user2", 2000, 2, "Company2", 200, usBank);

        User user3 = new User("user3", 3000, 12, "Company1", 300, euBank);
        User user4 = new User("user4", 4000, 2, "Company2", 400, euBank);

        User user5 = new User("user5", 5000, 12, "Company1", 500, chinaBank);
        User user6 = new User("user6", 6000, 2, "Company2", 600, chinaBank);

        impl.fundUser(user1, 100);
        impl.paySalary(user1);
        impl.transferMoney(user1, user2, 500);
        impl.withdrawOfUser(user1, 100);

        impl.fundUser(user2, 200);
        impl.paySalary(user2);
        impl.transferMoney(user2, user3, 500);
        impl.withdrawOfUser(user2, 100);

        impl.fundUser(user3, 300);
        impl.paySalary(user3);
        impl.transferMoney(user3, user4, 500);
        impl.withdrawOfUser(user3, 100);

        impl.fundUser(user4, 400);
        impl.paySalary(user4);
        impl.transferMoney(user4, user5, 500);
        impl.withdrawOfUser(user4, 100);

        impl.fundUser(user5, 500);
        impl.paySalary(user5);
        impl.transferMoney(user5, user6, 500);
        impl.withdrawOfUser(user5, 100);

        impl.fundUser(user6, 600);
        impl.paySalary(user6);
        impl.transferMoney(user6, user1, 500);
        impl.withdrawOfUser(user6, 100);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);

    }
}
