package by.lebenkov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private List<Developer> developerList = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team creates project...");
        for (Developer developer : developerList)
            developer.writeCode();
    }
}
