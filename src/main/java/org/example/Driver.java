package org.example;


import org.example.Helpers.CourseGenerator;
import org.example.Helpers.Terminal;
import org.example.Helpers.UserGenerator;
import org.example.Models.*;

import java.util.ArrayList;
import java.util.Objects;

public class Driver {
    public static void main(String[] args) {

        String input = "";

        System.out.println("Welcome to the compass management system");
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        ICourseManager manager = new FilterCourseName();


        Terminal.authenticate();

        System.out.println("-------Menu------");
        System.out.println("1. Courses");
        input = Terminal.getInput();

        switch (input) {
            case "1":
                //View all courses
                System.out.println("1. View all Courses");
                System.out.println("2. Search by Reference Number");
                input = Terminal.getInput();
                if (input.equalsIgnoreCase("1")) {
                    manager.sort(courseList);
                }
                //Search for a specific course
                if (input.equalsIgnoreCase("2")) {
                    System.out.println("Search by course ID Example: 'CHEM'");
                    input = Terminal.getInput();
                    manager.search(input);
                }
                //Ability to add course to cart
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