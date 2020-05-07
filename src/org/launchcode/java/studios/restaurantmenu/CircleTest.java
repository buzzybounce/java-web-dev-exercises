package org.launchcode.java.studios.restaurantmenu;

class Circle {

    private double radius;

    Circle () {

        this.radius = 0;

    }

    Circle (double radius) {

        this.radius = 0;

    }

    public static double returnArea (double radius) {

        return Math.PI * radius * radius;

    }

    public double returnRadius () {

        return this.radius;

    }

}

public class CircleTest {

  public static void main (String[] args) {

      Circle barbiCircle = new Circle (5.0);
      Circle brennaCircle = new Circle(10.0);

      barbiCircle.returnArea(barbiCircle.returnRadius());

      Circle.returnArea(3.0);



  }

}
