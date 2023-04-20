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

public class FilterReferenceNumber implements ICourseManager {

    @Override
    public void sort(ArrayList<Course> courseList) {
        courseList.sort(Comparator.comparing(Course::getCourseReferenceNum));
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    @Override
    public ArrayList<Course> search(String query) {
        return null;
    }
}
