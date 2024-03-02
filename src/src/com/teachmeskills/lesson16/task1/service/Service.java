package src.com.teachmeskills.lesson16.task1.service;

import src.com.teachmeskills.lesson16.task1.client.Client;

import java.util.Iterator;
import java.util.Map;

/**
 * The Service class contains the clientOutput() method, which takes a Map<String, Client> and outputs
 * it to the console in a for each loop. The clientOutputIterator() method takes a Map<String, Client>
 * and outputs it in a while loop (iterator.hasNext()) to the console.
 * The outputKeys() method takes a Map<String, Client> and outputs Keys to the console.
 * The outputValues() method takes a Map<String, Client> and outputs Values to the console.
 */
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
