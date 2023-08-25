package by.lebenkov.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(ButTracker butTracker) {
        if (butTracker.isActiveSprint())
            System.out.println("Developer is solving problems");
        else
            System.out.println("Developer is reading book");
    }
}
