/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Cart.java
 */

/* This class
 *
 */
package org.example.Models;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {
    ArrayList<Course> cart = new ArrayList<>();

    public Cart() {
    }

    public void addItem(Course course) {
        cart.add(course);
    }
    public void removeItem(Course course) {
        cart.remove(course);
    }

    // Computes the total and adds a 15% sales tax
    private double getTotal() {
       double total = 0.00;
       for (Course course : cart) {

           total += course.getPrice();
       }
       return total + (total * 0.15);
    }
    public void viewItems() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("-----------------------------------------");
        System.out.println("Your Cart:");
        for (Course item : cart) {
            System.out.println(item);
        }

        System.out.println("Total: " + currencyFormatter.format(getTotal()));
        System.out.println("-----------------------------------------\n");
    }
}
