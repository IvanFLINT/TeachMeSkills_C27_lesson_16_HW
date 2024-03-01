package src.com.teachmeskills.lesson16.task1.orders;

import java.util.ArrayList;
import java.util.List;

public class Orders {
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
    Orders(double price, String description){
        this.price = price;
        this.description = description;
    }
    public static Orders output(){
        Orders or1 = new Orders(123.23,"Aple");
        Orders or2 = new Orders(234.56,"Phone");
        Orders or3 = new Orders(567.267,"Tele");
        List<Orders> list = new ArrayList<>();
        list.add(or1);
        list.add(or2);
        list.add(or3);

        for (Orders or: list){
            System.out.println(or);
        }
        return or1;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
