package Lection3.Task4;

/**
 * Created by Администратор on 04.09.2016.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary(){
        balance += salary;
    }

    void withdraw(int summ){
        int commision;
        if (summ < 1000) {
            commision = 5;
            balance -= (summ + summ*commision/100);
        }
        else {
           commision = 10;
            balance -= (summ + summ*commision/100);
        }
    }

    public int companyNameLength() {
        int companyNameLength = companyName.length();
        return companyNameLength;
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }
}
