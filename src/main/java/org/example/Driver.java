package org.example;


import org.example.Helpers.CourseGenerator;
import org.example.Helpers.PrintUtils;
import org.example.Helpers.Terminal;
import org.example.Models.*;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        String input;
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        ICourseManager<ArrayList<Course>> managerID = new FilterCourseID();
        ICourseManager<Course> managerRef = new FilterReferenceNumber();

        Cart cart = new Cart();

        System.out.println(courseList.get(2).getPrerequisites());
        //System.out.println(managerID.search("MATH 101", courseList));




        System.out.println("Welcome to the compass management system \n");


        Terminal.authenticate();


        System.out.println("-------Menu------");
        System.out.println("1. Courses");
        input = Terminal.getInput();


        while (!input.equalsIgnoreCase("q")) {
            System.out.println("1. View all Courses");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by reference number");
            System.out.println("4. Add course to cart");
            System.out.println("5. View Cart");
            input = Terminal.getInput();
            switch (input) {
                case "1" -> {
                    //View all courses
                    PrintUtils.print(managerID.sort(courseList));
                }
                case "2" -> {
                    System.out.println("Search by course ID Example: 'CHEM'");
                    input = Terminal.getInput();
                    PrintUtils.print(managerID.search(input, courseList));
                }
                case "3" -> {
                    System.out.println("Enter reference number");
                    input = Terminal.getInput();
                    PrintUtils.print(managerRef.search(input, courseList));
                }
//                case "4" -> {
//                    System.out.println("Enter reference number to add item to cart.");
//                    input = Terminal.getInput();
//                    Course item = managerRef.search(input, courseList);
//                    cart.addItem(item);
//                }
                case "5" -> cart.viewItems();
            }

        }

    }
}