package Lection9.Lection7;


/**
 * Created by Администратор on 16.10.2016.
 */
public class Order implements Comparable<Order>{


    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
        id = this.hashCode();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order order = (Order) obj;


        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != order.itemName) return false;
        if (user != order.user) return false;

        return ((Order) obj).getShopIdentificator() == this.shopIdentificator;
    }

    @Override
    public int hashCode() {
        int result = (price * 95);
        result = 31 * result + itemName.length() + user.getLastName().length();
        return result;
    }

    @Override
    public String toString() {

        return "[" + this.itemName + " " + this.price + currency + " " + user + "]";
    }

    @Override
    public int compareTo(Order o) {
        return price - o.getPrice();
    }


}

