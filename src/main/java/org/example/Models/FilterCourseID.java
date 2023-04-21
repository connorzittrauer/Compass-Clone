/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByCourseName.java
 */

/* This class
 *
 */
package org.example.Models;

import org.example.Helpers.CourseGenerator;

import java.util.ArrayList;
import java.util.Comparator;

public class FilterCourseID implements ICourseManager<ArrayList<Course>> {
    ArrayList<Course> filteredList = new ArrayList<>();
    @Override
    public ArrayList<Course> sort(ArrayList<Course> courseList) {
        //Sort by the course name algorithm
        courseList.sort(Comparator.comparing(Course::getCourseName));
        return courseList;
    }

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


