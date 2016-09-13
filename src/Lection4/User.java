package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class User {
    public User(String name, double balance, int monthOfEmployment, String companyName, int salary, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    long id = this.hashCode();
    String name;
    double balance;
    int monthOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    @Override
    public String toString() {
        String infoAboutUser = id + " " + name + " " +
                balance + " " + monthOfEmployment + " " +
                companyName + " " + salary + " " + bank;
        return infoAboutUser;
    }
}
