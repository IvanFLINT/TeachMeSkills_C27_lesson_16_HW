package src.com.teachmeskills.lesson16.task1.runner;

import src.com.teachmeskills.lesson16.task1.fabrik.Fabrik;
import src.com.teachmeskills.lesson16.task1.service.Service;

/**
 * The Runner class calls methods to display information to the console.
 */
public class Runner {
    public static void main(String[] args) {
        Service.clientOutput(Fabrik.customerInput());
        Service.clientOutputIterator(Fabrik.customerInput());
        Service.outputKeys(Fabrik.customerInput());
        Service.outputValues(Fabrik.customerInput());
    }
}
