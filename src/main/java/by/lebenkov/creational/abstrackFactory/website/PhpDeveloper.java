package by.lebenkov.creational.abstrackFactory.website;

import by.lebenkov.creational.abstrackFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
