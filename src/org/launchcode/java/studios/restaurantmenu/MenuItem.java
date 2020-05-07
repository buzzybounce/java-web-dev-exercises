package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.util.Objects;

// Food

public class MenuItem {

    private double price;
    private static String storeWhereThisFoodItemIsBeingSold;
    private String description;
    private String category;
    private boolean isNew;
    private Date added;

    MenuItem () {

        this.price = 0;
        this.storeWhereThisFoodItemIsBeingSold = "";
        this.description = "";
        this.category = "";
        this.isNew = true;
        this.added = new Date();

    }

    MenuItem (double price, String description, String category) {

        this.price = price;
        this.storeWhereThisFoodItemIsBeingSold = "Your Store";
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.added = new Date();

    }

    public void setPrice (double price) {

        this.price = price;

    }

    public void setDescription (String description) {

        this.description = description;

    }

    public void setCategory (String category) {

        this.category = category;

    }

    public double getPrice () {

        return this.price;

    }

    public String getDescription () {

        return this.description;

    }

    public String getCategory () {

        return this.category;

    }

    public boolean getIsNew () {

        return this.isNew;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getDescription(), getCategory());
    }

}
