/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: Terminal.java
 */

/* This class provides a terminal user interface that is used throughout
 * the main menu loop. It also provides a method for authentication.
 */
package org.example.Helpers;

import org.example.Models.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    private static Scanner scanner = new Scanner(System.in);
    private static String input = "", studentID, password;
    private static boolean validating = true;
    // Generate Singleton Instance
    private static UserGenerator generator = UserGenerator.getInstance();
    private static ArrayList<User> userList = generator.generateUsers();

    public static String getInput() {

        System.out.print("> ");
        input = scanner.nextLine();
        return input;
    }

    /*  Method for authenticating the user. It simply puts the user in a loop
     *  and checks strings against the user input. It loops until there is a valid
     *  username and password. */
    public static void authenticate() {
        while (validating) {
            System.out.println("Username: ");
            studentID = Terminal.getInput();
            System.out.println("Password: ");
            password = Terminal.getInput();

            boolean loginSuccessful = false;

            for (User user : userList) {
                if (studentID.equalsIgnoreCase(user.getStudentID()) && password.equalsIgnoreCase(user.getPassword())) {
                    loginSuccessful = true;
                    System.out.println("Login Successful");
                    System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
                    validating = false;
                }
            }
            if (!loginSuccessful) {
                System.out.println("Try again");
            }
        }
    }
}
