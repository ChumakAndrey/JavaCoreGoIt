package Lection7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        List <User> usersList = new ArrayList<>();
        usersList.add(new User("Will", "Smith", "New York", 5000));
        usersList.add(new User("Ann", "Wou", "Vegas", 4000));
        usersList.add(new User("Andrew", "Chumak", "Kharkiv", 1000));
        usersList.add(new User("Nikita", "Yonk", "Budapesht", 4500));
        usersList.add(new User("Veronika", "Stravinsky", "Lviv", 8000));
        usersList.add(new User("Kate", "White", "Penza", 300));
        usersList.add(new User("Pavel", "Volya", "Anapa", 7000));
        usersList.add(new User("James", "Bond", "London", 2000));
        usersList.add(new User("Chack", "Norris", "Texas", 7000));
        usersList.add(new User("Bruce", "Lee", "Pekin", 1000));

        List <Order> ordersList = new LinkedList<>();
        ordersList.add(new Order(100, Currency.USD, "Pen", "1Shop", usersList.get(0)));
        ordersList.add(new Order(200, Currency.UAH, "Pencil", "2Shop", usersList.get(1)));
        ordersList.add(new Order(300, Currency.USD, "Book", "3Shop", usersList.get(2)));
        ordersList.add(new Order(4000, Currency.UAH, "Calculator", "4Shop", usersList.get(3)));
        ordersList.add(new Order(200, Currency.USD, "Knife", "5Shop", usersList.get(4)));
        ordersList.add(new Order(600, Currency.UAH, "Folk", "6Shop", usersList.get(5)));
        ordersList.add(new Order(700, Currency.USD, "Folk", "6Shop", usersList.get(6)));
        ordersList.add(new Order(200, Currency.UAH, "Glasses", "8Shop", usersList.get(7)));
        ordersList.add(new Order(900, Currency.USD, "Clock", "1Shop", usersList.get(8)));
        ordersList.add(new Order(1000, Currency.UAH, "Car", "5Shop", usersList.get(9)));
        ordersList.add(new Order(2000, Currency.USD, "Clock", "1Shop", usersList.get(8)));
        ordersList.add(new Order(900, Currency.USD, "Clock", "1Shop", usersList.get(8)));

        Comparator <Order> sortByPriceIncrease = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1 != o2) {
                    return o1.getPrice() - o2.getPrice();
                }
                else return o1.getUser().getCity().compareTo(o1.getUser().getCity());
            }
        };

        Comparator <Order> sortByPriceDecrease = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        Comparator <Order> sortByItemNameAndShopId = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName() == o2.getItemName() && o1.getShopIdentificator() == o2.getShopIdentificator()) {
                    return o1.getUser().getCity().compareTo(o1.getUser().getCity());
                }
                else if (o1.getItemName() == o2.getItemName() && o1.getUser().getCity() == o2.getUser().getCity()) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                else return o1.getItemName().compareTo(o1.getItemName());
            }
        };

        ordersList.sort(sortByPriceIncrease);
        System.out.println(ordersList);

        ordersList.sort(sortByPriceDecrease);
        System.out.println(ordersList);

        ordersList.sort(sortByItemNameAndShopId);
        System.out.println(ordersList);

        Order.deleteDuplicates(ordersList);
        System.out.println(ordersList);

        Order.deleteUnderPrice1500(ordersList);
        System.out.println(ordersList);

        Order.separateCurrency(ordersList);

    }
}
