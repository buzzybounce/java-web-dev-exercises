package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static ArrayList<MenuItem> restaurantMenu;
    private static Date updated;

    Menu () {

        this.restaurantMenu = new ArrayList<>();
        this.updated = new Date ();

    }

    public void addMenuItem (MenuItem item) {

        this.restaurantMenu.add(item);
        this.updated = new Date();

    }

    public void removeMenuItem (MenuItem item) {

        if (restaurantMenu.contains(item)) {

            restaurantMenu.remove(item);
            this.updated = new Date();

        }

    }

    public MenuItem getMenuItem (MenuItem food) {

        return this.restaurantMenu.get(restaurantMenu.indexOf(food));

    }

    public ArrayList<MenuItem> getMenu () {

       return this.restaurantMenu;

    }

    public void printItem (MenuItem food) {

        if (restaurantMenu.contains(food)) {

            System.out.println ("The food is in the menu: $" + restaurantMenu.get(restaurantMenu.indexOf(food)).getPrice() + " || Description: " + restaurantMenu.get(restaurantMenu.indexOf(food)).getDescription() + " || Category: " + restaurantMenu.get(restaurantMenu.indexOf(food)).getCategory());

        }

        else {

            System.out.println ("The food item is not in the menu.");

        }


    }

    public void printMenu () {

        for (MenuItem food: restaurantMenu) {

            System.out.println ("$" + food.getPrice() + " || Description: " + food.getDescription() + " || Category: " + food.getCategory());

        }

    }

    public Date getDate () {

        return this.updated;

    }

    public static void compareFood (MenuItem foodOne, MenuItem foodTwo) {

        if (foodOne.equals(foodTwo)) {

            System.out.println ("Both foods are identical and should not be added into the menu again");
//            return true;

        }

        else {

//            return false;
            System.out.println ("Both foods are not identical");

        }

    }

}
