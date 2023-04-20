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

//        Terminal.authenticate();
//
//        System.out.println("-------Menu------");
//        System.out.println("1. Course Finder");
//        input = Terminal.getInput();


        //Sort by course name

        ISortable sortByName = new SortByCourseName();
        sortByName.sort(courseList);

        //Sort by reference number
        ISortable sortByReferenceNumber = new SortByReferenceNumber();
        sortByReferenceNumber.sort(courseList);




    }
}