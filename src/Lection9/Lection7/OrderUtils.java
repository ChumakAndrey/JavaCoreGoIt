package Lection9.Lection7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 08.11.2016.
 */
public class OrderUtils  {

    public List deleteDuplicates (List<Order> order) {
        return order.stream().distinct().collect(Collectors.toList());
    }


    public List<Order> deleteUnderPrice1500 (List <Order> order) {
        return order.stream().filter(order1 -> (order1.getPrice()>1500))
                .collect(Collectors.toList());
    }

    void separateCurrency (List <Order> order) {
        List<Order> USD;
        List<Order> UAH;
        USD = order.stream().filter(order1 -> (order1.getCurrency()==(Currency.USD)))
                .collect(Collectors.toList());
        UAH = order.stream().filter(order1 -> (order1.getCurrency()==(Currency.UAH)))
                .collect(Collectors.toList());
        System.out.println(USD);
        System.out.println(UAH);
    }

    void sortOrdersInDecreasePrice (List<Order> orders){
        List<Order> sorted = orders.stream().sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

    void sortOrdersInIncreasePrice(List<Order> orders){
        List<Order> sorted = orders.stream().sorted((o1, o2) -> (o1.getPrice()-o2.getPrice()))
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

    void sortByItemName(List<Order> orders){
        System.out.println(orders.stream().sorted((o1, o2) -> o1.getItemName().compareTo(o2.getItemName()))
                .collect(Collectors.toList()));
    }
}
