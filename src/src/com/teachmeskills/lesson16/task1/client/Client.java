package src.com.teachmeskills.lesson16.task1.client;

import src.com.teachmeskills.lesson16.task1.constant.PassportID;
import src.com.teachmeskills.lesson16.task1.orders.Orders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    private String name;
    private String age;
    private String registrationDate;
    private List<Orders> clientOrder;

    public List<Orders> getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(List<Orders> clientOrder) {
        this.clientOrder = clientOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Client(String name, String age, String registrationDate, List<Orders> clientOrder) {
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
        this.clientOrder = clientOrder;
    }

    public static Map<String, Client> customerInput() {
        Client cl1 = new Client("Вася", "21", "21.02.2023", Orders.output());
        Client cl2 = new Client("Петя", "27", "12.06.2023", Orders.output());
        Client cl3 = new Client("Витя", "26", "15.09.2023", Orders.output());
        Map<String, Client> map1 = new HashMap<>();
        map1.put(PassportID.PASSPORT_ID1, cl1);
        map1.put(PassportID.PASSPORT_ID2, cl2);
        map1.put(PassportID.PASSPORT_ID3, cl3);
        return map1;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}

