/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: User.java
 */

/* This class
 *
 */
package org.example.Models;

import java.util.ArrayList;

public class User {
    String studentID, password, firstName , lastName;
    ArrayList<String> shoppingCart;
    public User(String studentID, String password, String firstName, String lastName) {
        this.studentID = studentID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return studentID + "\n" + password + "\n" + firstName + "\n" + lastName + "\n";
    }
}
