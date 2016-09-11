package Lection4;

/**
 * Created by Администратор on 09.09.2016.
 */
public class User {
    long id;
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
