package src.com.teachmeskills.lesson16.task1.client;

import src.com.teachmeskills.lesson16.task1.orders.Orders;

import java.util.List;

/**
 * The Client class contains the fields name, registrationDate, age and a list of orders clientOrder
 * to describe the client. Get, set methods and constructor have been created. Reassigned toString() method
 */

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

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", registrationDate='" + registrationDate + "\n" +
                "clientOrder= " + clientOrder + '\'' +
                '}';
    }
}

