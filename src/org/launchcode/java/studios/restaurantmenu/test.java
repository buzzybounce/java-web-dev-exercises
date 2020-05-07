package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class test {

    public static void main (String[] args) {

//        Menu menuBook = new Menu ();
        MenuItem foodOne = new MenuItem (15, "bland", "main course");
        MenuItem foodTwo = new MenuItem (20, "very gooey", "appetizer");
        MenuItem foodThree = new MenuItem (30, "tasty", "dessert");
        MenuItem foodFour = new MenuItem (15, "bland", "main course");

//        menuBook.addMenuItem(foodOne);
//        System.out.println ("Food one was added at: " + menuBook.getDate());
//        foodTwo.setPrice(25);
//        menuBook.addMenuItem(foodTwo);
//        System.out.println ("Food two was added at: " + menuBook.getDate());


//        menuBook.removeMenuItem(foodTwo);
//
//        for (MenuItem test: bookUpdated) {
//
//            System.out.println ("$" + test.getPrice() + " || Description: " + test.getDescription() + " || Category: " + test.getCategory());
//
//        }
//
//        menuBook.printItem(foodTwo);
//        menuBook.printItem(foodThree);
//
//        menuBook.printMenu();

        Menu.compareFood(foodOne,foodFour);

    }

}
