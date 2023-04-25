/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByReferenceNumber.java
 */

/* This class utilizes the strategy pattern and implements the ICourseManager interface to provide methods
 * for sorting and searching courses based on Reference Number.
 */
package org.example.Interfaces;

import org.example.Models.Course;
import java.util.ArrayList;
import java.util.Comparator;

public class FilterReferenceNumber implements ICourseManager<Course> {

    // This method sorts the course catalog numerically.
    @Override
    public ArrayList<Course> sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseReferenceNum));
        return courseList;
    }

    /* This method re The search method returns a single Course object
     * if a match is found or null if no match is found.
     */
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
