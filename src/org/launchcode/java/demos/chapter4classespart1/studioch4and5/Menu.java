package org.launchcode.java.demos.chapter4classespart1.studioch4and5;

import java.util.ArrayList;

public class Menu {

    private String restaurantName;
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Menu (String restaurantName, ArrayList<MenuItem> menuItems) {
        this.restaurantName = restaurantName;
        this.menuItems = menuItems;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        if (!menuItems.contains(menuItem)) {menuItems.add(menuItem);}
        else {System.out.println("Menu item already exists!");}
    }

    public void removeMenuItem(MenuItem menuItem) {
        if (menuItems.contains(menuItem)) {menuItems.remove(menuItem);}
        else {System.out.println("Menu item does not exist!");}
    }

    @Override
    public String toString() {
        return "Menu{" +
                "restaurantName='" + restaurantName + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }


}
