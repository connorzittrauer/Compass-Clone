package org.example;


import org.example.Helpers.CourseGenerator;
import org.example.Helpers.Terminal;
import org.example.Models.*;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        String input = "";

        System.out.println("Welcome to the compass management system");
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        ICourseManager managerID = new FilterCourseID();
        ICourseManager mananagerRef = new FilterReferenceNumber();

        Terminal.authenticate();


        System.out.println("-------Menu------");
        System.out.println("1. Courses");
        input = Terminal.getInput();


        while (!input.equalsIgnoreCase("q")) {
            System.out.println("1. View all Courses");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by reference number");
            input = Terminal.getInput();
            switch (input) {
                case "1":
                    //View all courses
                    if (input.equalsIgnoreCase("1")) {
                        managerID.sort(courseList);
                    }
                    break;
                case "2":
                    System.out.println("Search by course ID Example: 'CHEM'");
                    input = Terminal.getInput();
                    managerID.search(input);
                    break;
                    //Ability to add course to cart
                case "3":
                    System.out.println("Enter reference number");
                    input = Terminal.getInput();
                    mananagerRef.search(input);
                    break;
            }

        }
        System.out.println("");




//        //Sort by course name
//
//        ISortable sortByName = new SortByCourseName();
//        sortByName.sort(courseList);
//
//        //Sort by reference number
//        ISortable sortByReferenceNumber = new SortByReferenceNumber();
//        sortByReferenceNumber.sort(courseList);




    }
}