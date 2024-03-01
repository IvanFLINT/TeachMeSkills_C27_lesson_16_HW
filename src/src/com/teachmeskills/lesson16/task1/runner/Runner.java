package src.com.teachmeskills.lesson16.task1.runner;

import src.com.teachmeskills.lesson16.task1.client.Client;
import src.com.teachmeskills.lesson16.task1.constant.PassportID;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Client cl1 = new Client("Вася", "21" , "21.02.2023");
        Client cl2 = new Client("Петя", "27" , "12.06.2023");
        Client cl3 = new Client("Витя", "26" , "15.09.2023");
        Map<String,Client> map1 = new HashMap<>();
        map1.put(PassportID.PASSPORT_ID1,cl1);
        map1.put(PassportID.PASSPORT_ID2,cl2);
        map1.put(PassportID.PASSPORT_ID3,cl3);

        for(Map.Entry<String,Client> cl : map1.entrySet()){
            System.out.println("Key " + cl.getKey() + " " + " Value " + cl.getValue());
        }
    }

}
