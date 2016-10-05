package Lection6;

/**
 * Created by Администратор on 26.09.2016.
 */
public class User {
    private long id;
    private String firstName, lastName;
    private int salary;
    private int balance;



    public User(String firstName, String lastName, int salary, int balance) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
        id = this.hashCode();
    }

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return  false;

        User user = (User) obj;


        if (firstName != user.firstName) return false;
        if (lastName != user.lastName) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;

        return ((User) obj).getSalary() == this.salary;
    }

    @Override
    public int hashCode() {
        int result = (salary * 95);
        result = 31 * result + balance + firstName.length();
        return result;
    }

    @Override
    public String toString() {

        return this.firstName + " " + this.lastName;
    }
}
