package by.lebenkov.creational.abstractFactory.banking;

import by.lebenkov.creational.abstractFactory.Developer;
import by.lebenkov.creational.abstractFactory.Manager;
import by.lebenkov.creational.abstractFactory.ProjectTeamFactory;
import by.lebenkov.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
