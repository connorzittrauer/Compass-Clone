/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: PrintUtility.java
 */

/* This class
 *
 */
package org.example.Helpers;

import org.example.Models.Course;

import java.util.ArrayList;

public class PrintUtils {
    public static void print(ArrayList<Course> courseList) {
        if (!courseList.isEmpty()) {
            for (Course course : courseList) {
                System.out.println(course);
            }
        }
        else {
            System.out.println("No classes matching the keyword were found.\n");
        }


    }
    public static void print (Course course) {
        if (course != null) {
            System.out.println(course);
        }
        else {
            System.out.println("Course not found.\n");
        }
    }
}
