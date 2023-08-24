package by.lebenkov.creational.abstrackFactory.banking;

import by.lebenkov.creational.abstrackFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
