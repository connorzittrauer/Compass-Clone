/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByReferenceNumber.java
 */

/* This class
 *
 */
package org.example.Models;


import java.util.ArrayList;
import java.util.Comparator;

public class FilterReferenceNumber implements ICourseManager<Course> {
    @Override
    public ArrayList<Course> sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseReferenceNum));
        return courseList;
    }

    @Override
    public Course search(String query, ArrayList<Course> courseSingleton) {
        Course course = null;

        for (Course c : courseSingleton) {
            if (c.getCourseReferenceNum().equalsIgnoreCase(query)) {
                course = c;
            }
        }
        return course;
    }

}
