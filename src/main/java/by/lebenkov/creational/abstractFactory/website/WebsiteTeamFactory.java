package by.lebenkov.creational.abstractFactory.website;

import by.lebenkov.creational.abstractFactory.Developer;
import by.lebenkov.creational.abstractFactory.Manager;
import by.lebenkov.creational.abstractFactory.ProjectTeamFactory;
import by.lebenkov.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
