/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Course.java
 */

/* The class represents the Course object with attributes for name,
 * courseID, session, reference number, and price. It also maintains a list
 * of prerequisite courses. This class provides methods for getting course
 * attributes, managing prerequisite courses, and displaying course information
 * in a readable format.
 * This class implements the composite pattern for managing prerequisite courses.
 */
package org.example.Models;

import java.util.ArrayList;

public class Course {
    private final String name;
    private final String courseID;
    private final String session;
    private final String referenceNum;
    private final ArrayList<Course> courses = new ArrayList<>();
    private final double price;

    public Course(String name, String courseID, String session, String referenceNum, double price) {
        this.name = name;
        this.courseID = courseID;
        this.session = session;
        this.referenceNum = referenceNum;
        this.price = price;
    }

    public String getCourseName() {
        return this.name;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public String getCourseSession() {
        return this.session;
    }

    public String getCourseReferenceNum() {
        return this.referenceNum;
    }

    public double getPrice() {
        return this.price;
    }

    /* This is an implementation of the composite pattern */
    public void addPrerequisite(Course course) {
        courses.add(course);
    }

    /* This method adds the base course to the StringBuilder string,
     * iterates through the course ArrayList and recursively finds any
     * sub-courses of those courses within in the foreach loop.
     *
     * The base case is when the courses ArrayList is empty.
     */
    public String getPrerequisites() {
        StringBuilder sb = new StringBuilder();
        String baseCourse = this + "\n";
        sb.append(baseCourse);

        for (Course course : courses) {
            sb.append(course.getPrerequisites());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Course Name: " + name + "\nCourse ID: " + courseID +
                "\nSession NO. " + session + "\nReference NO " + referenceNum + "\n" + "Price: $" + price + "\n";
    }
}
