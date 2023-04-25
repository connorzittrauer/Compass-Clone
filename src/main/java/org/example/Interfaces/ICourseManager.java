/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: ISortable.java
 */

/* This interface defines the methods to be implemented by classes
 * that manage Course objects. The interface provides a generic type T to allow
 * flexibility in the return type of the search method. It defines two methods:
 * sort, which sorts an ArrayList of Course objects based on a specific criterion,
 * and search, which searches for a specific course or courses based on a given query.
 * It is an implementation of the strategy pattern.
 */
package org.example.Interfaces;

import org.example.Models.Course;
import java.util.ArrayList;

public interface ICourseManager<T> {
    ArrayList<Course> sort(ArrayList<Course> courses);
    T search(String query, ArrayList<Course> courseSingleton);
}
