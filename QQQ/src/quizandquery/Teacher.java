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
 * This class contains definition for Teacher object more specifically teacher
 * name, password. Also contain accessors-mutators and 2 essential methods -
 * toFile() and fromFile(), which writes information or state of Teacher object
 * to a file and reads the written information from the file respectively.
 */
public class Teacher {

    private String name; // name of the teacher
    private String password; // password of the teacher

    /**
     * constructor for Teacher
     */
    Teacher() {
        name = password = null; // initially setting to null
    }

    /**
     * constructor for Teacher
     *
     * @param name receives name for the Teacher object
     * @param password receives password for the Teacher object
     */
    Teacher(String name, String password) {
        this.name = name; // initializing name
        this.password = password; // initializing password

    }

    /**
     *
     * @return returns name of the teacher object
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name receives name for the teacher object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns password of the teacher object
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password receives password for the teacher object
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method gets an ArrayList of type Teacher and writes information of
     * those objects into a file "Files\Objects\teachers.txt"
     *
     * @param al receives an ArrayList of Teacher objects
     */
    public static void toFile(ArrayList<Teacher> al) {
        try {
            File file = new File("Files/Objects/teachers.txt"); // creating file object
            FileWriter fw = new FileWriter(file, false); // creating FileWriter for 'file'
            BufferedWriter buffer = new BufferedWriter(fw); // creating BufferedWriter object for 'fw'
            PrintWriter pw = new PrintWriter(buffer); // creating PrintWriter object for 'buffer'

            for (Teacher tt : al) {
                pw.println(tt.getName() + "*" + tt.getPassword()); // iterating through all the object of type teacher and writing their info. into file

            }

            pw.close(); // closing stream

        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    /**
     * This method reads Teacher object information from the file
     * "Files\Objects\teachers.txt" and puts in an ArrayList of type Student
     *
     * @return returns an ArrayList of "Teacher" objects
     */
    public static ArrayList<Teacher> fromFile() {
        ArrayList<Teacher> al = new ArrayList<>(); // creating an arraylist
        try {
            File file = new File("Files/Objects/teachers.txt"); // creating a file object
            Scanner sc = new Scanner(file); // creating a scanner object for 'file'

            while (sc.hasNext()) { // iterates untill EOF
                String tok = sc.nextLine();
                StringTokenizer tokens = new StringTokenizer(tok, "*");//using tokenizer to separate fused information separated by a delimiter
                while (tokens.hasMoreTokens()) {// iterating utill there no token left
                    String n = tokens.nextToken(); // getting name
                    String p = tokens.nextToken(); // getting password
                    al.add(new Teacher(n, p)); // adding object to the arraylist
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return al;
    }

}
