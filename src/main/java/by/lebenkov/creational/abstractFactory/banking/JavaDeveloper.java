package by.lebenkov.creational.abstractFactory.banking;

import by.lebenkov.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
