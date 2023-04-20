/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: UserGenerator.java
 */

/* This class
 *
 */
package org.example.Helpers;

import org.example.Models.User;

import java.util.ArrayList;

public class UserGenerator {
    private ArrayList<User> userList;
    private static UserGenerator instance;

    private UserGenerator()
        {
            userList = new ArrayList<>();
            userList.add(new User("", "", "Doe", "John"));
            userList.add(new User("B1400", "5678", "Smith", "Jane"));
            userList.add(new User("C1400", "9012", "Johnson", "Michael"));
            userList.add(new User("D1400", "3456", "Davis", "Emily"));
            userList.add(new User("E1400", "7890", "Wilson", "Robert"));
        };

    public static UserGenerator getInstance() {
        if (instance == null) {
            instance = new UserGenerator();
        }
        return instance;
    }

    public ArrayList<User> generateUsers() {
        return userList;
    }
}


