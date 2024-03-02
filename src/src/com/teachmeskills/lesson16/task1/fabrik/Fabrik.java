package src.com.teachmeskills.lesson16.task1.fabrik;

import src.com.teachmeskills.lesson16.task1.client.Client;
import src.com.teachmeskills.lesson16.task1.constant.PassportID;
import src.com.teachmeskills.lesson16.task1.orders.Orders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Fabrik class has a customerInput() method that returns a list of customers with their description.
 * The firstInputOrders(), secondInputOrders(), thirdInputOrders() methods have been created,
 * which return a list of customer orders.
 */
public class Fabrik {
    public static List<Orders> firstInputOrders() {
        Orders or1 = new Orders("Aple", "Antonovka", 10.45);
        Orders or2 = new Orders("Orange", "Hamlin", 10.45);
        Orders or3 = new Orders("Merry", "Adelina", 10.45);
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);
        return list;
    }

    public static List<Orders> secondInputOrders() {
        Orders or1 = new Orders("Boards", "Pine", 120.01);
        Orders or2 = new Orders("Glue", "PVA", 50.45);
        Orders or3 = new Orders("Nails", "100 х 50", 25.36);
        Orders or4 = new Orders("Hammer", "Carpentry", 34.9);
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);
        list.add(or4);
        return list;
    }

    public static List<Orders> thirdInputOrders() {
        Orders or1 = new Orders("CP", "Atlon", 456.45);
        Orders or2 = new Orders("VGA", "RTX 3080", 1700.34);
        Orders or3 = new Orders("SSD", "Kingston", 150.78);
        Orders or4 = new Orders("DDR", "Hunix", 200.23);
        Orders or5 = new Orders("HDD", "WD", 90.1);
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);
        list.add(or4);
        list.add(or5);
        return list;
    }

    public static Map<String, Client> customerInput() {
        Client cl1 = new Client("Вася", "21", "21.02.2023", Fabrik.firstInputOrders());
        Client cl2 = new Client("Петя", "27", "12.06.2023", Fabrik.secondInputOrders());
        Client cl3 = new Client("Витя", "26", "15.09.2023", Fabrik.thirdInputOrders());
        Map<String, Client> map = new HashMap<>();
        map.put(PassportID.PASSPORT_ID1, cl1);
        map.put(PassportID.PASSPORT_ID2, cl2);
        map.put(PassportID.PASSPORT_ID3, cl3);
        return map;
    }

}
