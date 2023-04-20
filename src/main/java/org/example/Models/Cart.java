/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Cart.java
 */

/* This class
 *
 */
package org.example.Models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Course> cart = new ArrayList<>();
    double total = 0.00;
    public Cart() {
    }

    public void addItem(Course course) {
        cart.add(course);
    }

    public double getTotal() {
       for (Course course : cart) {
           total += course.getPrice();
       }
       return total;
    }
    public void viewItems() {
        System.out.println("-----------------------------------------");
        System.out.println("Your Cart:");
        for (Course item : cart) {
            System.out.println(item);
        }
        System.out.println("-----------------------------------------");
    }
}
