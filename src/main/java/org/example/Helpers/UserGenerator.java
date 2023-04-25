/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: UserGenerator.java
 */

/* This class is an implementation of the Singleton pattern.
 * Within the constructor a list of users are hardcoded and added to an arraylist.
 * This class is used to preload the program with some user data.
 */
package org.example.Helpers;

import org.example.Models.User;
import java.util.ArrayList;

public class UserGenerator {
    private final ArrayList<User> userList;
    private static UserGenerator instance;

    private UserGenerator()
        {
            userList = new ArrayList<>();
            userList.add(new User("", "", "John", "Doe"));
            userList.add(new User("B1400", "5678", "Jane", "Smith"));
            userList.add(new User("C1400", "9012", "Michael", "Johnson"));
            userList.add(new User("D1400", "3456", "Emily", "Davis"));
            userList.add(new User("E1400", "7890", "Robert", "Wilson"));
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


