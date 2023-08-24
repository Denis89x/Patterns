package by.lebenkov.creational.abstrackFactory.website;

import by.lebenkov.creational.abstrackFactory.Developer;
import by.lebenkov.creational.abstrackFactory.Manager;
import by.lebenkov.creational.abstrackFactory.ProjectTeamFactory;
import by.lebenkov.creational.abstrackFactory.Tester;

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
