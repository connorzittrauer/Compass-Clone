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
import org.example.Models.FilterCourseID;
import org.example.Models.ICourseManager;

import java.util.ArrayList;

public class CourseGenerator {
    private ArrayList<Course> courseList;
    private static CourseGenerator instance;

    private CourseGenerator()
    {
        courseList = new ArrayList<>();
        courseList.add(new Course("Introduction to Algebra", "MATH 101", "1A", "123456", 850.0));
        courseList.add(new Course("Trigonometry", "MATH 102", "1B", "234567", 900.0));
        courseList.add(new Course("Calculus I", "MATH 201", "2A", "345678", 700.0));
        courseList.add(new Course("Calculus II", "MATH 202", "2B", "456789", 800.0));
        courseList.add(new Course("Introduction to Biology", "BIOL 101", "1A", "567890", 750.0));
        courseList.add(new Course("Anatomy and Physiology I", "BIOL 201", "1B", "678901", 950.0));
        courseList.add(new Course("Anatomy and Physiology II", "BIOL 202", "2A", "789012", 850.0));
        courseList.add(new Course("Introduction to Chemistry", "CHEM 101", "2B", "890123", 800.0));
        courseList.add(new Course("Organic Chemistry I", "CHEM 201", "1A", "901234", 900.0));
        courseList.add(new Course("Organic Chemistry II", "CHEM 202", "1B", "123457", 750.0));
        courseList.add(new Course("Introduction to Physics", "PHYS 101", "2A", "234568", 850.0));
        courseList.add(new Course("Mechanics", "PHYS 201", "2B", "345679", 800.0));
        courseList.add(new Course("Electricity and Magnetism", "PHYS 202", "1A", "456780", 950.0));
        courseList.add(new Course("Introduction to Computer Science", "COMP 101", "1B", "567891", 750.0));
        courseList.add(new Course("Data Structures and Algorithms", "COMP 201", "2A", "678902", 900.0));
        courseList.add(new Course("Operating Systems", "COMP 301", "2B", "135246", 800.0));
        courseList.add(new Course("Introduction to Psychology", "PSYC 101", "1A", "246357", 850.0));
        courseList.add(new Course("Developmental Psychology", "PSYC 201", "1B", "357468", 900.0));
        courseList.add(new Course("Abnormal Psychology", "PSYC 202", "2A", "468579", 750.0));
        courseList.add(new Course("Introduction to Sociology", "SOCI 101", "2B", "579680", 950.0));
        courseList.add(new Course("Social Psychology", "SOCI 201", "1A", "680791", 800.0));
        courseList.add(new Course("Sociology of Race and Ethnicity", "SOCI 202", "1B", "791802", 850.0));
        courseList.add(new Course("World History to 1500", "HIST 101", "2A", "802913", 950.0));
        courseList.add(new Course("World History since 1500", "HIST 202", "2B", "913024", 800.0));
        courseList.add(new Course("Introduction to Philosophy", "PHIL 101", "1A", "240135", 900.0));
        courseList.add(new Course("Calculus III", "MATH 301", "1A", "246890", 900.0));
        courseList.add(new Course("Discrete Mathematics", "MATH 302", "1B", "357901", 850.0));
        courseList.add(new Course("Microbiology", "BIOL 301", "2A", "468012", 950.0));
        courseList.add(new Course("Ecology", "BIOL 302", "2B", "579123", 800.0));
        courseList.add(new Course("Inorganic Chemistry", "CHEM 301", "1A", "680234", 850.0));

        addCoursePrerequisite("MATH 201", "MATH 101");
        addCoursePrerequisite("MATH 202", "MATH 201");
        addCoursePrerequisite("MATH 301", "MATH 202");
        addCoursePrerequisite("MATH 302", "MATH 201");
        addCoursePrerequisite("BIOL 201", "BIOL 101");
        addCoursePrerequisite("BIOL 202", "BIOL 201");
        addCoursePrerequisite("BIOL 301", "BIOL 201");
        addCoursePrerequisite("BIOL 302", "BIOL 202");
        addCoursePrerequisite("COMP 201", "COMP 101");
        addCoursePrerequisite("COMP 301", "COMP 201");


    }
    public static CourseGenerator getInstance() {
        if (instance == null) {
            instance = new CourseGenerator();
        }
        return instance;
    }

    // Helper method that employ the composite pattern to add course prerequisites
    private void addCoursePrerequisite(String baseCourseID, String preRequisiteID) {
        ICourseManager<ArrayList<Course>> managerID = new FilterCourseID();

        // Looks up the courses by ID
        ArrayList<Course> baseCourseList = managerID.search(baseCourseID, courseList);
        ArrayList<Course> preRequisiteList = managerID.search(preRequisiteID, courseList);

        Course baseCourse = baseCourseList.get(0);
        Course preRequisite = preRequisiteList.get(0);

        baseCourse.addPrerequisite(preRequisite);
    }

    public ArrayList<Course> generateCourses() {
        return courseList;
    }
}
