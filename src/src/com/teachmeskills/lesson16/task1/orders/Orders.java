package src.com.teachmeskills.lesson16.task1.orders;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    Orders(String name, String description, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static List<Orders> output() {
        Orders or1 = new Orders("Aple", "Antonovka", 10.45);
        Orders or2 = new Orders("Aple", "Antonovka", 10.45);
        Orders or3 = new Orders("Aple", "Antonovka", 10.45);
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);
        return list;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
