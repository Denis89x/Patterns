package by.lebenkov.creational.abstrackFactory.website;

import by.lebenkov.creational.abstrackFactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Website PM manages website project");
    }
}
