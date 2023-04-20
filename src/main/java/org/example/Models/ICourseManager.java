/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: ISortable.java
 */

/* This interface
 *
 */
package org.example.Models;

import java.util.ArrayList;

public interface ICourseManager {
    void sort(ArrayList<Course> courses);

    ArrayList<Course> search(String query);
}
