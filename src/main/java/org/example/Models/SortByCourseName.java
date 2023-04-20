/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: SortByCourseName.java
 */

/* This class
 *
 */
package org.example.Models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByCourseName implements ISortable {
//    @Override
//    public ArrayList<Course> sort(ArrayList<Course> courseList) {
//        //Sort by the course name algorithm
//        courseList.sort(Comparator.comparing(Course::getCourseName));
//
//        return courseList;
//    }
    @Override
    public void sort(ArrayList<Course> courseList) {
        //Sort by the course name algorithm
        courseList.sort(Comparator.comparing(Course::getCourseName));
        for (Course course : courseList) {
            System.out.println(course);
        }

    }
}
