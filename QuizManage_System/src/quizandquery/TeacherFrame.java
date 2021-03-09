package quizandquery;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class is for creating TeacherFrame where teachers can set MCQ question
 * and go to query frame after successfully logging in
 */
public class TeacherFrame extends JFrame {

    private static ArrayList<String> question = new ArrayList<>();

    private Container c;
    private Font f;
    private JLabel questionL, optionsL, cbs, confirm, solution, signIn_as;
    private JScrollPane scroll;
    private JTextArea question_area;
    private JTextField one, two, three, four, sol;
    private JLabel oneL, twoL, threeL, fourL;
    private JComboBox select;
    private JButton clear, add, query, back;
    private Teacher t1;
    

    /**
     * constructor for TeacherFrame
     */
    TeacherFrame() {
        t1 = null;// setting to null
        initializeComponents();// causes frame components to be initialized
    }

    /**
     * constructor for TeacherFrame
     *
     * @param t receives reference to Teacher object and initializes t1 and
     * invokes initializeComponents().
     */
    TeacherFrame(Teacher t) {
        t1 = t; // initializing Teacher object
        initializeComponents();// causes frame components to be initialized
    }

    /**
     * This method initializes all the components of the frame.(GUI)
     */
    public void initializeComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// disposes frame if exit button is clicked
        this.setSize(900, 900);// sets size for the frame
        this.setLocationRelativeTo(null);// sets initial position of the frame to the center
        this.setTitle("Teacher");// sets the title of the frame

        f = new Font("Georgia", Font.BOLD, 18);// creating font object for a different font

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34));// setting the background color of the frame

        signIn_as = new JLabel("Signed In as: " + t1.getName());// creating jlabel object for signed_in
        //multiline + add(email)
        signIn_as.setOpaque(true);
        signIn_as.setBackground(Color.GRAY);// setting background color
        signIn_as.setBounds(650, 1, 200, 25);// setting boundary for JLabel
        // align text
        c.add(signIn_as);// adding label to container

        cbs = new JLabel("Select Subject");//creating new JLabel object for subject selection
        cbs.setForeground(Color.WHITE);// setting foreground color to white
        cbs.setBounds(10, 10, 150, 30); // setting boundary for label
        c.add(cbs);// adding label to the container

        query = new JButton("Query");// creating new JButton for query frame 
        query.setBounds(100, 170, 90, 30);// setting boundary for button
        query.setForeground(Color.BLUE);// setting foreground color of the frame
        query.setBackground(Color.WHITE); // setting backgroung color of the frame
        c.add(query);// adding button to container
        query.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Query qq = new Query(t1);// creating new Query object for query frame
                dispose();// disposing current frame
            }

        });

        back = new JButton("Back");// creating button object for going back to previous frame
        back.setBounds(170, 35, 65, 30); // setting boundary for button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TeacherLoginFrame().setVisible(true);// creating new StudentLoginFrame(previus frame) and making it visible
                dispose();// disposing current frame
            }

        });
        c.add(back);// adding button to container

        select = new JComboBox(initializeQuestionName()); // creating new JComboBox object
        select.setBounds(10, 35, 150, 30);// setting boundary for JComboBox
        select.setEditable(true);// setting the ComboBox Editable
        c.add(select);// adding comboBox to the container
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                question_area.setText("");// setting the question_area blank
                one.setText("");// setting the option1 blank
                two.setText("");// setting the option2 blank
                three.setText("");// setting the option3 blank
                four.setText("");// setting the option4 blank
                sol.setText("");// setting the sol blank
                
                
                
               
            }
        });

        questionL = new JLabel("Question"); // creating JLabel object fro Question
        questionL.setBounds(10, 200, 80, 40);//setting boundary for JLabel
        questionL.setForeground(Color.WHITE);//settin foreground for label
        c.add(questionL);// adding label to the Container

        optionsL = new JLabel("Options");//creating options label
        optionsL.setBounds(10, 290, 80, 40); // setting boundary for label
        optionsL.setForeground(Color.WHITE);//setting foreground color
        c.add(optionsL);//adding label to container

        solution = new JLabel("Solution"); //creating new JLabel
        solution.setBounds(10, 330, 80, 40); // setting boundary for label
        solution.setForeground(Color.RED); // setting font/foreground for label
        c.add(solution); // adding label to the container

        sol = new JTextField(); // creating solution textField
        sol.setBounds(100, 340, 130, 20); // setting boundary for textfield
        sol.setFont(new Font("Times New Roman", Font.BOLD, 18)); // setting font for the text field
        c.add(sol); // adding textfield to the container

        question_area = new JTextArea(); // text area for question
        question_area.setLineWrap(true); // setting to have new line when boundary rached
        question_area.setWrapStyleWord(true); // setting wrap style to prevent breaking a word
        question_area.setFont(new Font("Times New Roman", Font.PLAIN, 18)); // setting font for text area
        
        
        
        scroll = new JScrollPane(question_area); // new JScrollPane for JTextArea
        scroll.setBounds(100, 200, 700, 70); // setting boundary for scroll pane
        c.add(scroll); // adding scroll pane
        


        oneL = new JLabel(" A"); // creating label for option A
        oneL.setBounds(100, 299, 30, 25); // setting boundary for label
        oneL.setOpaque(true); 
        oneL.setBackground(Color.RED); // setting background color of the label
        oneL.setFont(new Font("Times New Roman", Font.BOLD, 18)); // setting the font of the label
        c.add(oneL); // adding label to the container

        one = new JTextField(); //creating JTextField for writing option
        one.setBounds(140, 299, 90, 25); //setting boundary for text field
        one.setFont(new Font("Times New Roman", Font.BOLD, 18));//settin font of the textfield
        c.add(one);// adding text field to the container

        twoL = new JLabel(" B");// creating label for option B
        twoL.setBounds(240, 299, 30, 25);// setting boundary for label
        twoL.setOpaque(true);
        twoL.setBackground(Color.RED);// setting background color of the label
        twoL.setFont(new Font("Times New Roman", Font.BOLD, 18));// setting the font of the label
        c.add(twoL);// adding label to the container

        two = new JTextField();//creating JTextField for writing option
        two.setBounds(280, 299, 90, 25);//setting boundary for text field
        two.setFont(new Font("Times New Roman", Font.BOLD, 18));//settin font of the textfield
        c.add(two);// adding text field to the container

        threeL = new JLabel(" C");// creating label for option C
        threeL.setBounds(380, 299, 30, 25);// setting boundary for label
        threeL.setOpaque(true);
        threeL.setBackground(Color.RED);// setting background color of the label
        threeL.setFont(new Font("Times New Roman", Font.BOLD, 18));// setting the font of the label
        c.add(threeL);// adding label to the container

        three = new JTextField();//creating JTextField for writing option
        three.setBounds(420, 299, 90, 25);//setting boundary for text field
        three.setFont(new Font("Times New Roman", Font.BOLD, 18));//settin font of the textfield
        c.add(three);// adding text field to the container

        fourL = new JLabel(" D");// creating label for option D
        fourL.setBounds(520, 299, 30, 25);// setting boundary for label
        fourL.setOpaque(true);
        fourL.setBackground(Color.RED);// setting background color of the label
        fourL.setFont(new Font("Times New Roman", Font.BOLD, 18));// setting the font of the label
        c.add(fourL);// adding label to the container

        four = new JTextField();//creating JTextField for writing option
        four.setBounds(560, 299, 90, 25);//setting boundary for text field
        four.setFont(new Font("Times New Roman", Font.BOLD, 18));//settin font of the textfield
        c.add(four);// adding text field to the container

        confirm = new JLabel(); // creating JLabel for Confirmation
        confirm.setBounds(670, 299, 200, 50); // setting boundary of jlabel
        confirm.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));//settin font for the jlabel
        confirm.setOpaque(true);
        confirm.setBackground(Color.GRAY); // setting background for the jLabel
        c.add(confirm);// adding jLabel to container

        clear = new JButton("Clear"); //creating JButton for clearing text fields
        clear.setForeground(Color.BLUE);
        clear.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));//setting font for button
        clear.setBounds(100, 390, 90, 30); // setting boundary for button
        c.add(clear); // adding button to the container
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                question_area.setText(null);//setting textarea blank
                one.setText(null);//setting textfield blank
                two.setText(null);//setting textfield blank
                three.setText(null);//setting textfield blank
                four.setText(null);//setting textfield blank
                sol.setText(null);//setting textfield blank
                confirm.setText("   Cleared");//setting text for confirmation label 
                confirm.setBackground(new Color(166, 226, 46));//setting new background for label
            }

        });

        add = new JButton("Add Question");//creating JButton for adding question
        add.setForeground(Color.BLUE);
        add.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));//setting font for button
        add.setBounds(200, 390, 200, 30);// setting boundary for button
        c.add(add);// adding button to the container
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (nullFieldInQuestion() == false) { // checking whether there is any blank field or not

                    File questionPaper = new File("Files/Question/" + select.getSelectedItem().toString() + ".txt"); // creating file object for question
                    File solve = new File("Files/Question/" + select.getSelectedItem().toString() + "solution" + ".txt"); // creating file object for solution
                    try {
                        FileWriter fr = new FileWriter(questionPaper, true); // for question-papaer
                        FileWriter fr_sol = new FileWriter(solve, true);  // for solution
                        BufferedWriter buffer = new BufferedWriter(fr);  // for question-papaer
                        BufferedWriter buffer_sol = new BufferedWriter(fr_sol);  // for solution
                        PrintWriter pw = new PrintWriter(buffer);  // for question-papaer
                        PrintWriter pw_sol = new PrintWriter(buffer_sol);  // for solution

                        pw.println(question_area.getText() + "*" + one.getText() + "*" + two.getText() + "*" + three.getText()
                                + "*" + four.getText());//combining question , and options using a delimiter

                        pw_sol.println(sol.getText()); // writing ques_option in a file

                        pw.close(); // closing stream
                        pw_sol.close();//closing stream
                        
                        
                    } catch (IOException ex) {
                        
                    }

                    question_area.setText(null);//setting textarea blank
                    one.setText(null);//setting textfield blank
                    two.setText(null);//setting textfield blank
                    three.setText(null);//setting textfield blank
                    four.setText(null);//setting textfield blank
                    sol.setText(null);//setting textfield blank
                    confirm.setText("  Question Addded");
                    confirm.setBackground(new Color(253, 151, 31));//setting new Background for label
                } else {
                    JOptionPane.showMessageDialog(null, "Field(s) is/are empty", "Error", JOptionPane.WARNING_MESSAGE); // showing warning if there is any empty field
                }
            }

            

        });


        this.setVisible(true); // making frame visible
    }

    /**
     * This method checks whether there is any empty field when the teacher
     * clicks "Add Question".
     *
     * @return returns 'true' if there is at least 1 empty field and 'false'
     * otherwise.
     */
    public boolean nullFieldInQuestion() {
        if ((question_area.getText().isEmpty()) || (one.getText().isEmpty()) || (two.getText().isEmpty()) || (three.getText().isEmpty()) || (four.getText().isEmpty()) || (sol.getText().isEmpty())) {
            return true;
        }
        return false;
    }

    /**
     * This method reads the name of the subjects from a file
     * "Files/Question/question_name.txt" and initializes an array of String and
     * returns it so that it can be used by 'select'(JComboBox) to show the
     * subject names to teachers and students
     *
     * @return returns an array of String with the name of the subjects
     */
    public static String[] initializeQuestionName() {

        File ques_name = new File("Files/Question/question_name.txt"); // creating file object

        try {
            Scanner que_name = new Scanner(ques_name); // creating Scanner for file

            while (que_name.hasNext()) { // iteration untill EOF
                String n = que_name.nextLine();
                question.add(n);
            }

        } catch (FileNotFoundException ex) {
            
        }

        String[] questionName = new String[question.size()]; // declaring and creating String[]
        question.toArray(questionName); // from arrayList to -> Array

        return questionName;

    }
    


}
