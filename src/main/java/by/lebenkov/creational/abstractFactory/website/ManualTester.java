package by.lebenkov.creational.abstractFactory.website;

import by.lebenkov.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("MT tests website");
    }
}
