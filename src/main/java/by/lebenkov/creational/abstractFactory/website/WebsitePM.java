package by.lebenkov.creational.abstractFactory.website;

import by.lebenkov.creational.abstractFactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Website PM manages website project");
    }
}
