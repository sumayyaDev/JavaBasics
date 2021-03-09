/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizandquery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Bears the blueprint or definition for Student object more specifically
 * student name, password. Also contain accessors-mutators and 2 essential
 * methods - toFile() and fromFile(), which writes information or state of
 * Student object to a file and reads the written information from the file
 * respectively.
 */
public class Student {

    private String name; // name of the student object
    private String password; // password of the student object

    /**
     * constructor Student
     */
    Student() {
        name = password = null; // setting variables to null
    }

    /**
     * constructor Student
     *
     * @param name receives name for the Student object
     * @param password receives password for the Student object
     */
    Student(String name, String password) {
        this.name = name; // initializing
        this.password = password; // initializing
    }

    /**
     *
     * @return returns name of the student object
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name receives name for the student object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns password of the student object
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password receives password for the student object
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method writes information of Students object in a file
     * "Files\Objects\students.txt"
     *
     * @param al receives an ArrayList of Student objects
     */
    public static void toFile(ArrayList<Student> al) {
        try {
            File file = new File("Files/Objects/students.txt"); // creating a file object
            FileWriter fw = new FileWriter(file); // creating FileWriter object for 'file'
            BufferedWriter buffer = new BufferedWriter(fw);//creating BufferedWriter object for fw
            PrintWriter pw = new PrintWriter(buffer);// creating PrintWrinter object for 'buffer'

            for (Student ss : al) {
                pw.println(ss.getName() + "*" + ss.getPassword()); // writing info. into file
            }

            pw.close(); // closing stream

        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    /**
     * This method reads Student object information from the file
     * "Files\Objects\students.txt" and puts in an ArrayList of type Student
     *
     * @return returns an ArrayList of "Student" objects
     */
    public static ArrayList<Student> fromFile() {
        ArrayList<Student> al = new ArrayList<>(); // creating an arraylist from reading object info. from file

        try {
            File file = new File("Files/Objects/students.txt"); // creating file object for reading
            Scanner sc = new Scanner(file); // creating scanner object for the file object

            while (sc.hasNext()) {
                String tok = sc.nextLine();
                StringTokenizer tokens = new StringTokenizer(tok, "*"); //using tokenizer to separate fused information separated by a delimiter
                while (tokens.hasMoreTokens()) { // iterating utill there is no token left
                    String n = tokens.nextToken(); // getting name
                    String p = tokens.nextToken(); // getting password
                    al.add(new Student(n, p)); // adding object to the arraylist
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return al;
    }

}
