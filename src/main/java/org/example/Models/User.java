/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: User.java
 */

/* This is a basic class to represent the User object with attributes for studentID,
 * password, first name, and last name. It provides methods for
 * getting and setting the user attributes, as well as a toString method for
 * displaying the user information in a readable format.
 */
package org.example.Models;

public class User {
    private final String studentID;
    private final String password;
    private final String firstName;
    private final String lastName;

    public User(String studentID, String password, String firstName, String lastName) {
        this.studentID = studentID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentID() { return studentID; }
    public String getPassword() { return password; }
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
