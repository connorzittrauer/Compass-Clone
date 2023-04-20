/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Course.java
 */

/* This class
 *
 */
package org.example.Models;


public class Course {
    private String name, courseID, session, referenceNum;

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



    @Override
    public String toString() {
        return "Course Name: " + name + "\nCourse ID: " + courseID +
                "\nSession NO. " + session + "\nReference NO " + referenceNum + "\n" + "Price: $" + price + "\n";
    }
}
