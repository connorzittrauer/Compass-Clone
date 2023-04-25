/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: UIManager.java
 */

/* This class
 *
 */
package org.example;

import org.example.Helpers.CourseGenerator;
import org.example.Helpers.PrintUtils;
import org.example.Helpers.Terminal;
import org.example.Models.*;

import java.util.ArrayList;

public class UIManager {
    private final ArrayList<Course> courseList;
    private final ICourseManager<ArrayList<Course>> managerID;
    private final ICourseManager<Course> managerRef;
    private final Cart cart;
    private String input ="";
    public UIManager() {
        managerRef = new FilterReferenceNumber();
        managerID = new FilterCourseID();
        courseList = CourseGenerator.getInstance().generateCourses();
        cart = new Cart();
    }
    public void start() {

        System.out.println("Welcome to the compass management system \n");
        Terminal.authenticate();

        while (!input.equalsIgnoreCase("q")) {
            System.out.println("------------------Menu-------------------");
            System.out.println("1. View all Courses");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by reference number");
            System.out.println("4. Add course to cart");
            System.out.println("5. Remove course from cart");
            System.out.println("6. View Cart");
            input = Terminal.getInput();

            switch (input) {
                case "1" -> viewCourses();
                case "2" -> searchById();
                case "3" -> searchByReferenceNumber();
                case "4" -> addToCart();
                case "5" -> removeFromCart();
                case "6" -> viewCart();
            }

        }
    }

    private void viewCourses() {
        PrintUtils.print(managerID.sort(courseList));
    }

    private void searchById(){
        System.out.println("Search by course ID Example: 'CHEM'");
        input = Terminal.getInput();
        PrintUtils.print(managerID.search(input, courseList));
    }

    private void searchByReferenceNumber() {
        System.out.println("Enter reference number");
        input = Terminal.getInput();
        Course courseRefLookup = managerRef.search(input, courseList);
        PrintUtils.print(courseRefLookup);

        if (courseRefLookup != null) {
            System.out.println("View Prerequisites? y/n");
            input = Terminal.getInput();
            if (input.equalsIgnoreCase("y")){
                System.out.println(courseRefLookup.getPrerequisites());
            }
        }

    }

    private void addToCart() {
        System.out.println("Enter reference number to add item to cart.");
        input = Terminal.getInput();
        Course item = managerRef.search(input, courseList);
        cart.addItem(item);
    }

    private void removeFromCart(){
        System.out.println("Enter reference number for the course you want to delete.");
        input = Terminal.getInput();
        Course course = managerRef.search(input, courseList);
        cart.removeItem(course);
    }

    private void viewCart() {
        cart.viewItems();
    }
}