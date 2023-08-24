package by.lebenkov.creational.abstractFactory.banking;

import by.lebenkov.creational.abstractFactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Banking PM manages banking project");
    }
}
