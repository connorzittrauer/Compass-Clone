/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByReferenceNumber.java
 */

/* This class
 *
 */
package org.example.Models;

import org.example.Helpers.CourseGenerator;

import java.util.ArrayList;
import java.util.Comparator;

public class FilterReferenceNumber implements ICourseManager<Course> {
    @Override
    public void sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseReferenceNum));
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    @Override
    public Course search(String query) {
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        Course course = null;
        boolean found = false;

        // Search by reference number
        for (Course c : courseList) {
            if (c.getCourseReferenceNum().equalsIgnoreCase(query)) {
                System.out.println(c);
                course = c;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found!");
        }

        return course;
    }
}
