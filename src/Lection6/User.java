package Lection6;

/**
 * Created by Администратор on 26.09.2016.
 */
public class User {
    private long id;
    private String firstName, lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }
}
