package src.com.teachmeskills.lesson16.task1.fabric;

import src.com.teachmeskills.lesson16.task1.client.Client;
import src.com.teachmeskills.lesson16.task1.constant.PassportID;
import src.com.teachmeskills.lesson16.task1.orders.Orders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fabrica {
    public static List<Orders> inputOrders() {
        Orders or1 = new Orders("Aple", "Antonovka", 10.45);
        Orders or2 = new Orders("Orange", "Hamlin", 10.45);
        Orders or3 = new Orders("Merry", "Adelina", 10.45);
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);
        return list;
    }
    public static Map<String, Client> customerInput() {
        Client cl1 = new Client("Вася", "21", "21.02.2023", Fabrica.inputOrders());
        Client cl2 = new Client("Петя", "27", "12.06.2023", Fabrica.inputOrders());
        Client cl3 = new Client("Витя", "26", "15.09.2023", Fabrica.inputOrders());
        Map<String, Client> map = new HashMap<>();
        map.put(PassportID.PASSPORT_ID1, cl1);
        map.put(PassportID.PASSPORT_ID2, cl2);
        map.put(PassportID.PASSPORT_ID3, cl3);
        return map;
    }

}
