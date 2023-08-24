package by.lebenkov.creational.abstrackFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
