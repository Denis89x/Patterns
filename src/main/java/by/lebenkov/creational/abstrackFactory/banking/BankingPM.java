package by.lebenkov.creational.abstrackFactory.banking;

import by.lebenkov.creational.abstrackFactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Banking PM manages banking project");
    }
}
