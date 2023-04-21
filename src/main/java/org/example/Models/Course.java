/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Course.java
 */

/* This class
 *
 */
package org.example.Models;


import java.nio.charset.CoderResult;
import java.util.ArrayList;

public class Course {
    private String name, courseID, session, referenceNum;
    private ArrayList<Course> courses = new ArrayList<>();
    private double price;

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
    public void addPrerequisite(Course course){
        courses.add(course);
    }

    /* This method adds the base course to the StringBuilder string,
     * iterates through the course ArrayList and recursively finds any
     * sub-courses of those courses within in the foreach loop.
     *
     * The base case is when the courses ArrayList is empty.
     */
    public String getPrerequisites()
    {
        StringBuilder sb = new StringBuilder();
        String baseCourse = this + "\n";
        sb.append(baseCourse);

        for (Course course : courses)
        {
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
