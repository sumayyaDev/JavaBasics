package quizandquery;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * This class contain necessary methods to use the methods provided in "Teacher"
 * class and "Student" class to Read and Write information about "Teacher"
 * objects and "Student" objects. It is never instantiated and it is an abstract
 * class
 */
abstract class Files {

    private static ArrayList<Teacher> teachers = new ArrayList<>(); //ArrayList for teacher objects
    private static ArrayList<Student> students = new ArrayList<>(); //ArrayList for student objects

    /**
     * This method initializes the ArrayList 'teachers'(which stores
     * information/state of teacher objects saved last time the program was
     * used) from File "Files\Objects\teachers.txt"
     */
    public static void initializeTeachers() {

        teachers = null; //initially set to null
        teachers = Teacher.fromFile(); // getting object info. from file and adding objects in ArrayList

    }

    /**
     * This method initializes the ArrayList 'students'(which stores
     * information, or state of student objects saved last time the program was
     * used) from File "Files\Objects\students.txt"
     */
    public static void initializeStudents() {

        students = null;//initially set to null
        students = Student.fromFile();// getting object info. from file and adding objects in ArrayList

    }

    /**
     * This method saves information(writes to file) of all current "Teacher"
     * objects to File "Files\Objects\teachers.txt" specially after adding a New
     * Teacher information
     */
    public static void saveTeachers() {
        Teacher.toFile(teachers); // writing teacher object info. in a file
    }

    /**
     * This method saves information(writes to file) of all current "Student"
     * objects to File "Files\Objects\students.txt" specially after adding a New
     * Student information
     */
    public static void saveStudents() {
        Student.toFile(students);// writing student object info. in a file
    }

    /**
     * This method adds New Teachers, by creating their profile and saving their
     * information
     *
     * @param t receives a "Teacher" object to save it in File by calling
     * saveTeachers()
     */
    public static void addTeacher(Teacher t) {
        initializeTeachers();//initializing 'teachers' ArrayList with saved Teacher objects
        teachers.add(t); // adding a new teacher
        saveTeachers(); // saving all the teacher objects in a file including new one
    }

    /**
     * This method adds New Students, by creating their profile and saving their
     * information
     *
     * @param s receives a "Student" object to save it in File by calling
     * saveStudents()
     */
    public static void addStudent(Student s) {
        initializeStudents(); //initializing 'students' ArrayList with saved Student objects
        students.add(s);// adding a new student
        saveStudents();// saving all the students objects in a file including new one
    }

    /**
     * This method reads information about "Teacher" objects and creates an
     * ArrayList of all saved "Teacher" objects
     *
     * @return returns an ArrayList of "Teacher" objects
     */
    public static ArrayList<Teacher> getTeachers() {
        initializeTeachers();//initializing 'teachers' ArrayList with saved Student objects
        return teachers;
    }

    /**
     * This method reads information about "Student" objects and creates an
     * ArrayList of all saved "Student" objects
     *
     * @return returns an ArrayList of "Student" objects
     */
    public static ArrayList<Student> getStudents() {
        initializeStudents();//initializing 'students' ArrayList with saved Student objects
        return students;
    }

    /**
     * This method prints information about all "Teacher" in the
     * console.(objects saved in the file).
     *
     */
    public static void printTeacher() {
        initializeTeachers(); // initializing teachers ArrayList
        for (Teacher t : teachers) {
            System.out.println(t.getName() + " " + t.getPassword());//iterating ArrayList and printing info. in console
        }
    }

    /**
     * This method prints information about all "Student" in the
     * console.(objects saved in the file).
     *
     */
    public static void printStudents() {
        initializeStudents(); // // initializing students ArrayList
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getPassword());//iterating ArrayList and printing info. in console
        }
    }

    /**
     * This method iterates over an ArrayList containing "Teacher" information
     * and matches current information with the sent information through
     * parameters and confirms whether this "Teacher" object is in the record or
     * not (used for "Log-in" purposes)
     *
     * @param name receives the name of the "Teacher" object for checking
     * @param password receives the password of the "Teacher" object for
     * checking
     * @return returns 'true' if "Teacher" record was found and 'false'
     * otherwise
     */
    public static boolean confirmTeacher(String name, String password) {
        ArrayList<Teacher> in = getTeachers();//initializing an ArrayList with current Teacher objects
        for (Teacher t : in) {
            if (t.getName().equals(name) & t.getPassword().equals(password)) { // iterating each teacher object and checking for user input match
                return true;
            }
        }
        return false;
    }

    /**
     * This method iterates over an ArrayList containing "Student" information
     * and matches current information with the sent information through
     * parameters and confirms whether this "Student" object is in the record or
     * not (used for "Log-in" purposes)
     *
     * @param name receives the name of the "Student" object for checking
     * @param password receives the password of the "Student" object for
     * checking
     * @return returns 'true' if "Student" record was found and 'false'
     * otherwise
     */
    public static boolean confirmStudent(String name, String password) {
        ArrayList<Student> al = getStudents();//initializing an ArrayList with current Student objects
        for (Student s : al) {
            if (s.getName().equals(name) & s.getPassword().equals(password)) {// iterating each teacher object and checking for user input match
                return true;
            }
        }
        return false;
    }
}

/**
 * This class is for creating a "Frame" that lets the user choose whether he/she
 * is a "Teacher" or a "Student"
 *
 * @author sumayya, nafi, samin
 */
public class CharacterFrame extends JFrame {

    private Container c;
    private JButton button1, button2;

    /**
     * Constructor for CharacterFrame invokes initializeComponents() method.
     */
    CharacterFrame() {
        initializeComponents();// it initializes frame components
    }

    /**
     * This method initializes all the components of the frame.(GUI)
     */
    public void initializeComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for closing program by clicking exit button
        this.setSize(800, 500);// frame size
        this.setLocationRelativeTo(null);//locates frame at the center
        this.setTitle("Quiz Management System");// frame title

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34)); // background color

        button1 = new JButton("Teacher"); // new button object for character select
        button1.setBounds(250, 200, 100, 30); // button boundary
        c.add(button1); // adding button to container

        button2 = new JButton("Student");// new button object for character select
        button2.setBounds(380, 200, 100, 30);// button boundary
        c.add(button2);// adding button to container
        
        JLabel lblNewLabel = new JLabel("Created by:");
        lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 16));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(610, 327, 107, 30);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("1. Sumayya Akter");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(620, 356, 138, 20);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("2. Fahmid Abrar Samin");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
        lblNewLabel_1_1.setBounds(620, 387, 154, 20);
        getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("3. Nafi Bin Noor");
        lblNewLabel_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
        lblNewLabel_1_1_1.setBounds(620, 415, 154, 20);
        getContentPane().add(lblNewLabel_1_1_1);

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) { // creates TeacherLoginFrame object and sets a new frame for teacher login
                TeacherLoginFrame teacher = new TeacherLoginFrame();
                dispose();//disposes previous frame.
            }

        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {// creates StudentLoginFrame object and sets a new frame for student login

                StudentLoginFrame student = new StudentLoginFrame();
                dispose();//disposes previous frame.

            }

        });
        setVisible(true);// makes frame visible.
    }

    /**
     * declares and creates a "CharacterFrame"
     *
     * @param args takes command line argument
     * @throws IOException Input Output Exception
     * @throws FileNotFoundException Exception when file is not found
     * @throws ClassNotFoundException Class not found
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        CharacterFrame outer_Frame = new CharacterFrame(); // declaring and creating CharacterFrame object

    }

}
