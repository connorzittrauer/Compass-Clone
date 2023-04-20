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
    ArrayList<Course> resultList = new ArrayList<>();
    @Override
    public void sort(ArrayList<Course> courseList) {
        //Sort by the course name algorithm
        courseList.sort(Comparator.comparing(Course::getCourseName));
        for (Course course : courseList) {
            System.out.println(course);
        }

    }

    @Override
    public ArrayList<Course> search(String query) {
        ArrayList<Course> courseList = CourseGenerator.getInstance().generateCourses();
        boolean found = false;

        // Search the CourseID to see if it contains keyword like 'CHEM' or 'MATH'
        for (Course course : courseList) {
            if (course.getCourseID().contains(query)) {
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

