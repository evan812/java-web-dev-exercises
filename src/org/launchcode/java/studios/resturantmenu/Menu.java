package org.launchcode.java.studios.resturantmenu;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    ArrayList<MenuItem> menuItems;
    public Date lastUpdate;


    public void Menu(){
        this.menuItems = new ArrayList<MenuItem>();
        this.lastUpdate = new Date();
    }

    public void addItem(MenuItem item){
        this.lastUpdate = new Date();
        this.menuItems.add(item);
    }

    public void removeItem(MenuItem item){
        this.lastUpdate = new Date();
        this.menuItems.remove(item);
    }

    public MenuItem getNewest(){
        return menuItems.get(menuItems.size()-1);
    }


    MenuItem soup = new MenuItem(17.50, "Hearty Steak Soup", "Main course");
    MenuItem wings = new MenuItem(10.98, "Spicy Wings ", "Appetizer");
    MenuItem cake = new MenuItem(8.50, "Lava Cake", "Dessert");
    MenuItem salad = new MenuItem(6.45, "Side Salad", "Appetizer");

}
