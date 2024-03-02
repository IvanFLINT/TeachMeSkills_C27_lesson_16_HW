package src.com.teachmeskills.lesson16.task1.runner;

import src.com.teachmeskills.lesson16.task1.client.Client;
import src.com.teachmeskills.lesson16.task1.fabric.Fabrica;
import src.com.teachmeskills.lesson16.task1.service.Service;

public class Runner {
    public static void main(String[] args) {
        Service.clientOutput(Fabrica.customerInput());
        Service.clientOutputIterator(Fabrica.customerInput());
        Service.outputKeys(Fabrica.customerInput());
        Service.outputValues(Fabrica.customerInput());
    }
}
