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

public class FilterReferenceNumber implements ICourseManager {
    ArrayList<Course> resultList = new ArrayList<>();
    @Override
    public void sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseReferenceNum));
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    @Override
    public ArrayList<Course> search(String query) {
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        boolean found = false;
        // Search by reference number
        for (Course course : courseList) {
            if (course.getCourseReferenceNum().equalsIgnoreCase(query)) {
                System.out.println(course);
                found = true;
                resultList.add(course);
            }
        }
        if (!found) {
            System.out.println("No courses found!");
        }

        return resultList;
    }
}
