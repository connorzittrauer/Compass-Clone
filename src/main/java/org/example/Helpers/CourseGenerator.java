/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: CompassTUI
 *  File Name: CourseGenerator.java
 */

/* This class
 *
 */
package org.example.Helpers;

import org.example.Models.Course;
import org.example.Models.FilterCourseID;
import org.example.Models.ICourseManager;

import java.util.ArrayList;

public class CourseGenerator {
    private ArrayList<Course> courseList;
    private static CourseGenerator instance;
    private ICourseManager<ArrayList<Course>> managerID = new FilterCourseID();
    private CourseGenerator()
    {

        courseList = new ArrayList<>();
        Course introAlg = new Course("Introduction to Algebra", "MATH 101", "1A", "123456", 850.0);
        courseList.add(introAlg);

        Course trig = new Course("Trigonometry", "MATH 102", "1B", "234567", 900.0);
        courseList.add(trig);

        Course calc1 = new Course("Calculus I", "MATH 201", "2A", "345678", 700.0);
        courseList.add(calc1);

        Course calc2 = new Course("Calculus II", "MATH 202", "2B", "456789", 800.0);
        courseList.add(calc2);

        Course introBio = new Course("Introduction to Biology", "BIOL 101", "1A", "567890", 750.0);
        courseList.add(introBio);

        Course anatomy1 = new Course("Anatomy and Physiology I", "BIOL 201", "1B", "678901", 950.0);
        courseList.add(anatomy1);

        Course anatomy2 = new Course("Anatomy and Physiology II", "BIOL 202", "2A", "789012", 850.0);
        courseList.add(anatomy2);

        Course introChem = new Course("Introduction to Chemistry", "CHEM 101", "2B", "890123", 800.0);
        courseList.add(introChem);

        Course orgChem1 = new Course("Organic Chemistry I", "CHEM 201", "1A", "901234", 900.0);
        courseList.add(orgChem1);

        Course orgChem2 = new Course("Organic Chemistry II", "CHEM 202", "1B", "123457", 750.0);
        courseList.add(orgChem2);

        Course introPhys = new Course("Introduction to Physics", "PHYS 101", "2A", "234568", 850.0);
        courseList.add(introPhys);

        Course mechanics = new Course("Mechanics", "PHYS 201", "2B", "345679", 800.0);
        courseList.add(mechanics);

        Course eAndM = new Course("Electricity and Magnetism", "PHYS 202", "1A", "456780", 950.0);
        courseList.add(eAndM);

        Course introCS = new Course("Introduction to Computer Science", "COMP 101", "1B", "567891", 750.0);
        courseList.add(introCS);

        Course dataStruct = new Course("Data Structures and Algorithms", "COMP 201", "2A", "678902", 900.0);
        courseList.add(dataStruct);

        Course os = new Course("Operating Systems", "COMP 301", "2B", "135246", 800.0);
        courseList.add(os);

        Course introPsych = new Course("Introduction to Psychology", "PSYC 101", "1A", "246357", 850.0);
        courseList.add(introPsych);

        Course devPsych = new Course("Developmental Psychology", "PSYC 201", "1B", "357468", 900.0);
        courseList.add(devPsych);

        Course abnormalPsych = new Course("Abnormal Psychology", "PSYC 202", "2A", "468579", 750.0);
        courseList.add(abnormalPsych);

        Course introSociology = new Course("Introduction to Sociology", "SOCI 101", "2B", "579680", 950.0);
        courseList.add(introSociology);

        Course socialPsych = new Course("Social Psychology", "SOCI 201", "1A", "680791", 800.0);
        courseList.add(socialPsych);

        Course raceAndEthnicity = new Course("Sociology of Race and Ethnicity", "SOCI 202", "1B", "791802", 850.0);
        courseList.add(raceAndEthnicity);

        Course worldHistory1500 = new Course("World History to 1500", "HIST 101", "2A", "802913", 950.0);
        courseList.add(worldHistory1500);

        Course worldHistorySince1500 = new Course("World History since 1500", "HIST 202", "2B", "913024", 800.0);
        courseList.add(worldHistorySince1500);

        Course introPhilosophy = new Course("Introduction to Philosophy", "PHIL 101", "1A", "240135", 900.0);
        courseList.add(introPhilosophy);

        Course calc3 = new Course("Calculus III", "MATH 301", "1A", "246890", 900.0);
        courseList.add(calc3);

        Course discreteMath = new Course("Discrete Mathematics", "MATH 302", "1B", "357901", 850.0);
        courseList.add(discreteMath);

        Course microbio = new Course("Microbiology", "BIOL 301", "2A", "468012", 950.0);
        courseList.add(microbio);

        Course ecology = new Course("Ecology", "BIOL 302", "2B", "579123", 800.0);
        courseList.add(ecology);

        Course inorganicChem = new Course("Inorganic Chemistry", "CHEM 301", "1A", "680234", 850.0);
        courseList.add(inorganicChem);

        // Add course prerequisites
        calc1.addPrerequisite(trig);
        calc1.addPrerequisite(introAlg);
        calc2.addPrerequisite(calc1);
        calc3.addPrerequisite(calc2);
        calc3.addPrerequisite(discreteMath);

        orgChem2.addPrerequisite(orgChem1);
        microbio.addPrerequisite(introBio);
        microbio.addPrerequisite(introChem);
        inorganicChem.addPrerequisite(introChem);
        inorganicChem.addPrerequisite(orgChem2);

        dataStruct.addPrerequisite(calc2);
        dataStruct.addPrerequisite(introCS);

    }

    public static CourseGenerator getInstance() {
        if (instance == null) {
            instance = new CourseGenerator();
        }
        return instance;
    }



    public ArrayList<Course> generateCourses() {
        return courseList;
    }
}
