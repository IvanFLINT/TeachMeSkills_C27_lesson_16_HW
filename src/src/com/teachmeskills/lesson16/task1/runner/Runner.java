package src.com.teachmeskills.lesson16.task1.runner;

import src.com.teachmeskills.lesson16.task1.client.Client;
import src.com.teachmeskills.lesson16.task1.constant.PassportID;
import src.com.teachmeskills.lesson16.task1.orders.Orders;
import src.com.teachmeskills.lesson16.task1.service.Service;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        Service.clientOutput(Client.customerInput());
    }
}
