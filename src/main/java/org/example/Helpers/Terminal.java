/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Terminal.java
 */

/* This class
 *
 */
package org.example.Helpers;

import org.example.Models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    static Scanner scanner = new Scanner(System.in);
    static String input = "", studentID, password;
    static boolean validating = true;
    // Generate Singleton Instance
    static UserGenerator generator = UserGenerator.getInstance();
    static ArrayList<User> userList = generator.generateUsers();
    public static String getInput() {

        System.out.print("> ");
        input = scanner.nextLine();
        return input;
    }

    public static void authenticate() {
        while (validating){
            System.out.println("Username: ");
            studentID = Terminal.getInput();
            System.out.println("Password: ");
            password = Terminal.getInput();

            boolean loginSuccessful = false;

            for ( User user : userList) {
                if(studentID.equalsIgnoreCase(user.getStudentID()) && password.equalsIgnoreCase(user.getPassword())) {
                    loginSuccessful = true;
                    System.out.println("Login Successful");
                    validating = false;
                }
            }
            if (!loginSuccessful) {
                System.out.println("Try again");
            }
        }
    }
}
