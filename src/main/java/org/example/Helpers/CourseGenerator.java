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
        courseList.add(new Course("Calculus", "MATH 101", "1A", "123456", 850.0));
        courseList.add(new Course("Linear Algebra", "MATH 202", "1B", "234567", 900.0));
        courseList.add(new Course("Introduction to Programming", "COMP 101", "2A", "345678", 700.0));
        courseList.add(new Course("Algorithms and Data Structures", "COMP 202", "2B", "456789", 800.0));
        courseList.add(new Course("Organic Chemistry", "CHEM 101", "1A", "567890", 750.0));
        courseList.add(new Course("Physical Chemistry", "CHEM 202", "1B", "678901", 950.0));
        courseList.add(new Course("World History", "HIST 101", "2A", "789012", 850.0));
        courseList.add(new Course("American History", "HIST 202", "2B", "890123", 800.0));
        courseList.add(new Course("Introduction to Psychology", "PSYC 101", "1A", "901234", 900.0));
        courseList.add(new Course("Social Psychology", "PSYC 202", "1B", "123457", 750.0));
        courseList.add(new Course("Introduction to Sociology", "SOCI 101", "2A", "234568", 850.0));
        courseList.add(new Course("Cultural Anthropology", "ANTH 202", "2B", "345679", 800.0));
        courseList.add(new Course("Spanish Language", "SPAN 101", "1A", "456780", 950.0));
        courseList.add(new Course("French Language", "FREN 101", "1B", "567891", 750.0));
        courseList.add(new Course("Japanese Language", "JAPN 101", "2A", "678902", 900.0));
        courseList.add(new Course("Biology", "BIOL 101", "1A", "135246", 800.0));
        courseList.add(new Course("Anatomy", "BIOL 202", "1B", "246357", 850.0));
        courseList.add(new Course("Environmental Science", "ENVR 101", "2A", "357468", 900.0));
        courseList.add(new Course("Geology", "ENVR 202", "2B", "468579", 750.0));
        courseList.add(new Course("Introduction to Literature", "LITR 101", "1A", "579680", 950.0));
        courseList.add(new Course("World Literature", "LITR 202", "1B", "680791", 800.0));
        courseList.add(new Course("Introduction to Film", "FILM 101", "2A", "791802", 850.0));
        courseList.add(new Course("Film Production", "FILM 202", "2B", "802913", 750.0));
        courseList.add(new Course("Introduction to Philosophy", "PHIL 101", "1A", "913024", 900.0));
        courseList.add(new Course("Ethics", "PHIL 202", "1B", "240135", 800.0));
        courseList.add(new Course("Music Theory", "MUSC 101", "2A", "351246", 750.0));
        courseList.add(new Course("History of Jazz", "MUSC 202", "2B", "462357", 950.0));
        courseList.add(new Course("Introduction to Theater", "THEA 101", "1A", "573468", 850.0));
        courseList.add(new Course("Acting", "THEA 202", "1B", "684579", 900.0));
        courseList.add(new Course("Introduction to Art", "ARTS 101", "2A", "795680", 800.0));
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
