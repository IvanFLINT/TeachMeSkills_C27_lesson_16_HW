package src.com.teachmeskills.lesson16.task1.service;

import src.com.teachmeskills.lesson16.task1.client.Client;

import java.util.Iterator;
import java.util.Map;

public class Service {
    public static void clientOutput(Map<String, Client> map) {
        for (Map.Entry<String, Client> cl : map.entrySet()) {
            System.out.println("\nKey " + cl.getKey() + " " + " Value " + cl.getValue());
        }
    }

    public static void clientOutputIterator(Map<String, Client> map) {
        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("\nKey = " + entry.getKey() + " -> Value: " + entry.getValue().toString());
        }
    }

    public static void outputKeys(Map<String, Client> map) {
        System.out.println("\nKeys = " + map.keySet());
    }

    public static void outputValues(Map<String, Client> map) {
        System.out.println("\nValues: " + map.values());
    }
}
