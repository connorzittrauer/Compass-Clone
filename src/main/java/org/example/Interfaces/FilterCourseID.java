/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByCourseName.java
 */

/* This class utilizes the strategy pattern and implements the ICourseManager interface to provide methods
 * for sorting and searching courses based on Course ID.
 */
package org.example.Interfaces;

import org.example.Models.Course;
import java.util.ArrayList;
import java.util.Comparator;

public class FilterCourseID implements ICourseManager<ArrayList<Course>> {
    ArrayList<Course> filteredList = new ArrayList<>();

    // This method returns an arraylist that sorts the course catalog alphabetically.
    @Override
    public ArrayList<Course> sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseName));
        return courseList;
    }

    /* The method returns a filtered ArrayList containing the matching courses based upon
     * the course input query.
     */
    @Override
    public ArrayList<Course> search(String query, ArrayList<Course> courseList) {

        // Search the CourseID to see if it contains keyword like 'CHEM' or 'MATH'
        for (Course course : courseList) {
            if (course.getCourseID().contains(query)) {
                filteredList.add(course);
            }
        }
        return filteredList;
    }
}


