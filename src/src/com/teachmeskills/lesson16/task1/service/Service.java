package src.com.teachmeskills.lesson16.task1.service;

import src.com.teachmeskills.lesson16.task1.client.Client;

import java.util.Map;

public class Service {
    public static void clientOutput(Map<String, Client> map){
        for (Map.Entry<String, Client> cl : map.entrySet()) {
            System.out.println("Key " + cl.getKey() + " " + " Value " + cl.getValue());
        }
    }
}
