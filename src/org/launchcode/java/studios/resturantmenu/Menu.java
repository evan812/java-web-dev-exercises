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

    public MenuItem getNewest(){
        return menuItems.get(menuItems.size()-1);
    }


//    MenuItem item = new MenuItem(17.50, "Hearty Steak Soup", "Main course");




}
