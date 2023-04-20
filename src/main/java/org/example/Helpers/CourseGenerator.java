/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: CourseGenerator.java
 */

/* This class
 *
 */
package org.example.Helpers;

import org.example.Models.Course;
import java.util.ArrayList;

public class CourseGenerator {
    private ArrayList<Course> courseList;
    private static CourseGenerator instance;

    private CourseGenerator()
    {
        courseList = new ArrayList<>();
        courseList.add(new Course("Calculus", "MATH 101", "1A", 123456));
        courseList.add(new Course("Linear Algebra", "MATH 202", "1B", 234567));
        courseList.add(new Course("Introduction to Programming", "COMP 101", "2A", 345678));
        courseList.add(new Course("Algorithms and Data Structures", "COMP 202", "2B", 456789));
        courseList.add(new Course("Organic Chemistry", "CHEM 101", "1A", 567890));
        courseList.add(new Course("Physical Chemistry", "CHEM 202", "1B", 678901));
        courseList.add(new Course("World History", "HIST 101", "2A", 789012));
        courseList.add(new Course("American History", "HIST 202", "2B", 890123));
        courseList.add(new Course("Introduction to Psychology", "PSYC 101", "1A", 901234));
        courseList.add(new Course("Social Psychology", "PSYC 202", "1B", 123457));
        courseList.add(new Course("Introduction to Sociology", "SOCI 101", "2A", 234568));
        courseList.add(new Course("Cultural Anthropology", "ANTH 202", "2B", 345679));
        courseList.add(new Course("Spanish Language", "SPAN 101", "1A", 456780));
        courseList.add(new Course("French Language", "FREN 101", "1B", 567891));
        courseList.add(new Course("Japanese Language", "JAPN 101", "2A", 678902));

    }
    public static CourseGenerator getInstance() {
        if (instance == null) {
            instance = new CourseGenerator();
        }
        return instance;
    }

    public ArrayList<Course> generateCourses() {
        return courseList;
    }
}
