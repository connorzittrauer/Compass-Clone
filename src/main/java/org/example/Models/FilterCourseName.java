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

import java.sql.SQLOutput;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedMap;

public class FilterCourseName implements ICourseManager {
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

        // Search the CourseID to see if it contains keyword like 'CHEM' or 'MATH'
        for (Course course : courseList) {
            if (course.getCourseID().contains(query)) {
                System.out.println(course);
                resultList.add(course);
            }
        }

        return resultList;
    }
}
