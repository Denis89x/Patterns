package by.lebenkov.creational.abstrackFactory.banking;

import by.lebenkov.creational.abstrackFactory.Developer;
import by.lebenkov.creational.abstrackFactory.Manager;
import by.lebenkov.creational.abstrackFactory.ProjectTeamFactory;
import by.lebenkov.creational.abstrackFactory.Tester;

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
