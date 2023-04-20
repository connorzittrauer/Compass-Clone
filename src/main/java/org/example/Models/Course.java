/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Course.java
 */

/* This class
 *
 */
package org.example.Models;

import java.util.ArrayList;
import org.example.Helpers.CourseGenerator;
public class Course {
    private String name, courseID, session;
    private int referenceNum;

    public Course(String name, String courseID, String session, int referenceNum) {
        this.name = name;
        this.courseID = courseID;
        this.session = session;
        this.referenceNum = referenceNum;
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

    public int getCourseReferenceNum() {
        return this.referenceNum;
    }




    @Override
    public String toString() {
        return "Course Name: " + name + "\nCourse ID: " + courseID +
                "\nSession NO. " + session + "\nReference NO " + referenceNum + "\n";
    }
}
