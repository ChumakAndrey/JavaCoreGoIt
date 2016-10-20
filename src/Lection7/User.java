package Lection7;

/**
 * Created by Администратор on 16.10.2016.
 */
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    {
        id = this.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;


        if (firstName != user.firstName) return false;
        if (lastName != user.lastName) return false;
        if (city != user.city) return false;
        if (balance != user.balance) return false;

        return ((User) obj).getCity() == this.city;
    }

    @Override
    public int hashCode() {
        int result = (balance * 95);
        result = 31 * result + balance + firstName.length();
        return result;
    }

    @Override
    public String toString() {

        return this.firstName + " " + this.lastName;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
