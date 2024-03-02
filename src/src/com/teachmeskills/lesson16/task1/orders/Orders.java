package src.com.teachmeskills.lesson16.task1.orders;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private String name;
    private double price;
    private String description;

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


    public Orders(String name, String description, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
