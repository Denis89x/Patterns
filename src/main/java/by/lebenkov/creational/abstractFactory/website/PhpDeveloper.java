package by.lebenkov.creational.abstractFactory.website;

import by.lebenkov.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
