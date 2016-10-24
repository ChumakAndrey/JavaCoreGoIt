package Lection7;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 16.10.2016.
 */
public class Order {
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


    public static void deleteDuplicates (List <Order> order) {
        for (int i = 0; i<order.size(); i++) {
            if(order.get(i).equals(order.get(i++))){
                order.remove(i);
            }
        }
    }

    public static List<Order> deleteUnderPrice1500 (List <Order> order) {
        List <Order> up1500 = new LinkedList<>();
        for (Order ord : order) {
            if (ord.getPrice() >= 1500) up1500.add(ord);
        }
        /*ListIterator<Order> iterator = order.listIterator();
        while(iterator.hasNext()){
            if(iterator.n)*/
        order = up1500;
        return order;
        }

    public static void separateCurrency (List <Order> order) {
        List<Order> USD = new LinkedList<>();
        List<Order> UAH = new LinkedList<>();
        for (Order ord : order){
            if(ord.getCurrency()==Currency.USD) USD.add(ord);
            else UAH.add(ord);
        }
        System.out.println(USD);
        System.out.println(UAH);

    }


    }

