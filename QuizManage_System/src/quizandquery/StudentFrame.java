/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizandquery;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class is for creating a frame where student can start quiz exam, go to
 * query frame after successfully logging in.
 */
public class StudentFrame extends JFrame {

    private static ArrayList<String> t_que_name_o = new ArrayList<>();

    private static int questionCount = 1, mark = 0;
    private Container c;
    private JButton startExam, submit, abandon, query, back;
    private JLabel question, cbs, marks, signIn_as, inform;
    private JTextArea question_display;
    private JScrollPane scroll;
    private JRadioButton optionA, optionB, optionC, optionD;
    private ButtonGroup optionGroup;
    private Font f;
    private JComboBox select;
    private String solvE;
    public ArrayList<Question> q_display = new ArrayList<>();
    public ArrayList<String> sol_n = new ArrayList<>();
    private Student s1;
    private static Runner runner1;

    
    private boolean abandoned = false;
    private boolean toSleep = false;
    private boolean _first_time_SE = true;


    /**
     * constructor for StudentFrame. It invokes initializeComponents() method.
     */
    StudentFrame() {
    	getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
        s1 = null; // setting to null
        initializeComponents(); // causes frame components to be initialized
    }

    /**
     * constructor for StudentFrame
     *
     * @param s receives reference to Student object and initializes s1 and
     * invokes initializeComponents().
     */
    StudentFrame(Student s) {
        s1 = s; // initializing student object
        initializeComponents(); // causes frame components to be initialized
    }

    /**
     * This method initializes all the components of the frame.(GUI)
     */
    public void initializeComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// disposes frame if exit button is clicked
        this.setSize(922, 520); // sets size for the frame
        this.setLocationRelativeTo(null); // sets initial position of the frame to the center
        this.setTitle("Student");// sets the title of the frame

        f = new Font("Georgia", Font.BOLD, 15); // creating font object for a different font

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(39, 40, 34));// setting the background color of the frame

        query = new JButton("Query"); // creating new JButton for query frame 
        query.setBounds(780, 0, 120, 35); // setting boundary for button
        query.setForeground(Color.WHITE); // setting foreground color of the frame
        query.setBackground(new Color(31, 58, 147)); // setting backgroung color of the frame
        c.add(query); // adding button to container
        query.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Query qq = new Query(s1); // creating new Query object for query frame
                dispose(); // disposing current frame
            }

        });

        back = new JButton("Back"); // creating button object for going back to previous frame
        back.setBounds(170, 35, 65, 30); // setting boundary for button
        back.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentLoginFrame().setVisible(true); // creating new StudentLoginFrame(previus frame) and making it visible
                dispose(); // disposing current frame
            }

        });
        c.add(back); // adding button to container

        inform = new JLabel("Next question appears as submit your answer"); // creating JLabel object for 7 second caution
        inform.setFont(new Font("Comic Sans MS", Font.BOLD, 15)); // setting font for label
        inform.setBounds(240, 35, 550, 30); // setting boundary for label
        inform.setBackground(new Color(39, 40, 34)); // setting background color for label
        inform.setForeground(Color.WHITE); // setting foreground / font color for label
        c.add(inform); // adding label to the container

        cbs = new JLabel("Select Subject"); //creating new JLabel object for subject selection
        cbs.setForeground(Color.WHITE); // setting foreground color to white
        cbs.setBounds(10, 10, 150, 30); // setting boundary for label
        c.add(cbs); // adding label to the container

        signIn_as = new JLabel("Signed In as: " + s1.getName()); // creating jlabel object for signed_in
        signIn_as.setOpaque(true);
        signIn_as.setBackground(Color.GRAY); // setting background color
        signIn_as.setBounds(580, 0, 200, 25); // setting boundary for JLabel
        c.add(signIn_as); // adding label to container

        marks = new JLabel(); // creating JLabel object for marks display
        marks.setBounds(150, 400, 550, 30); // setting boundary of the label
        marks.setFont(f); // setting font of the label
        marks.setOpaque(true); 
        marks.setBackground(Color.DARK_GRAY); // setting background color of the label
        marks.setForeground(Color.WHITE); // setting font/foreground color of the label
        c.add(marks); // adding label to the container


        select = new JComboBox(initializeQuestionName()); // creating new JComboBox object
        select.setBounds(10, 35, 150, 30); // setting boundary for JComboBox
        select.setEditable(true); // setting the ComboBox Editable
        c.add(select); // adding comboBox to the container
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                question_display.setText(""); // setting the question_display blank
                optionA.setText(""); // setting the optionA blank
                optionB.setText("");// setting the optionB blank
                optionC.setText("");// setting the optionC blank
                optionD.setText("");// setting the optionD blank

            }
        });

        optionGroup = new ButtonGroup(); // creating new ButtonGroup for option buttons

        submit = new JButton("Submit"); // creating new button for submitting ans.
        submit.setBounds(10, 400, 80, 30); // setting boundary for the button
        submit.setBackground(new Color(1, 152, 117)); // setting the background color
        submit.setForeground(Color.WHITE); // setting the font/ foreground color
        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                
                toSleep = true;
                if(!abandoned) {
                if (optionA.isSelected()) { // checks whether option A is selected or not
                    if (check(optionA.getText())) {//matches option with solution 
                        mark++;
                        System.out.println("correct ans." + mark);
                        marks.setText("Score: " + mark); // sets text for the mark textfield
                    } else {
                        marks.setText("Score: " + mark);
                        System.out.println("wrong");
                    }
                } else if (optionB.isSelected()) {// checks whether option B is selected or not
                    if (check(optionB.getText())) {//matches option with solution 
                        mark++;
                        System.out.println("correct ans." + mark);
                        marks.setText("Score: " + mark);// sets text for the mark textfield
                    } else {
                        System.out.println("wrong");
                        marks.setText("Score: " + mark);
                    }
                } else if (optionC.isSelected()) {// checks whether option C is selected or not
                    if (check(optionC.getText())) {//matches option with solution 
                        mark++;
                        System.out.println("correct ans." + mark);
                        marks.setText("Score: " + mark);// sets text for the mark textfield
                    } else {
                        System.out.println("wrong");
                        marks.setText("Score: " + mark);
                    }
                } else if (optionD.isSelected()) {// checks whether option D is selected or not
                    if (check(optionD.getText())) {//matches option with solution 
                        mark++;
                        System.out.println("correct ans." + mark);
                        marks.setText("Score: " + mark);// sets text for the mark textfield
                    } else {
                        System.out.println("wrong");
                        marks.setText("Score: " + mark);
                    }
                }
                }
            }
        });
        c.add(submit); // adds submit button to the container

        startExam = new JButton("Start Exam"); // creating new button object for starting the exam
        startExam.setBounds(10, 75, 120, 20); // setting boundary of the button
        c.add(startExam); // adding button to the container

        startExam.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                runner1 = new Runner(); // creating runner object(extends Thread)
                
                if(runner1.isAlive())
                    runner1.interrupt();

                startExam.setEnabled(false); // disabling "Start Exam" button
                questionCount = 1;

                String questionOption, get, opt1, opt2, opt3, opt4;

                File questionPaper = new File("Files/Question/" + select.getSelectedItem().toString() + ".txt");//selection question file
                File solve = new File("Files/Question/" + select.getSelectedItem().toString() + "solution" + ".txt");//selection solution file


                if(_first_time_SE) {
                	_first_time_SE = false;

                question = new JLabel(); // new JLabel for question
                question.setOpaque(true);
                question.setFont(f); // setting font for JLabel
                question.setBackground(new Color(39, 40, 34)); //setting backgroung of the label
                question.setForeground(Color.WHITE); //setting font/foreground of the label
                question.setBounds(10, 110, 200, 19); // setting boundary for the label

                c.add(question); // adds label to the container

                question_display = new JTextArea(); // creates a new JtextArea object for displaying ques.
                question_display.setFont(f); // setting font
                question_display.setOpaque(true); 
                question_display.setBackground(new Color(253, 151, 31)); // settin background color
                question_display.setEditable(false); // setting TextArea non-Editable
                question_display.setLineWrap(true); // setting line to go to new line if reaches boundary
                question_display.setWrapStyleWord(true); // avoiding to break a word while creating new line

                c.add(question_display); // adding textarea to the container

                scroll = new JScrollPane(question_display); // creating a new JscrollPane for question_display
                scroll.setBounds(10, 140, 700, 70); // setting boundary of the ScrollPane
                c.add(scroll); // adding scroll pane to the container

                optionA = new JRadioButton(); // creatong a Radiobutton object for option
                optionA.setFont(f);//setting font
                optionA.setBounds(10, 220, 400, 40);//setting boundary
                optionA.setBackground(new Color(39, 40, 34));//setting background color
                optionA.setForeground(Color.WHITE); // setting foreground color
                c.add(optionA);// adding RadioButton to the container

                optionB = new JRadioButton();// creatong a Radiobutton object for option
                optionB.setFont(f);//setting font
                optionB.setBounds(10, 260, 400, 40);//setting boundary
                optionB.setBackground(new Color(39, 40, 34));//setting background color
                optionB.setForeground(Color.WHITE);// setting foreground color
                c.add(optionB);// adding RadioButton to the container

                optionC = new JRadioButton();// creatong a Radiobutton object for option
                optionC.setFont(f);//setting font
                optionC.setBounds(10, 300, 400, 40);//setting boundary
                optionC.setBackground(new Color(39, 40, 34));//setting background color
                optionC.setForeground(Color.WHITE);// setting foreground color
                c.add(optionC);// adding RadioButton to the container

                optionD = new JRadioButton();// creatong a Radiobutton object for option
                optionD.setFont(f);//setting font
                optionD.setBounds(10, 340, 400, 40);//setting boundary
                optionD.setBackground(new Color(39, 40, 34));//setting background color
                optionD.setForeground(Color.WHITE);// setting foreground color
                c.add(optionD);// adding RadioButton to the container

                optionGroup.add(optionA); // adding the radioButton to button group -> avoids multiple selection
                optionGroup.add(optionB);// adding the radioButton to button group -> avoids multiple selection
                optionGroup.add(optionC);// adding the radioButton to button group -> avoids multiple selection
                optionGroup.add(optionD);// adding the radioButton to button group -> avoids multiple selection
                }


                try {
                    Scanner scQ = new Scanner(questionPaper); //Scanner object for question file
                    Scanner scS = new Scanner(solve);//Scanner object for solution file

                    while (scQ.hasNext() & scS.hasNext()) {//iterating untill EOF

                        questionOption = scQ.nextLine();
                        solvE = scS.nextLine();

                        StringTokenizer tokenQuestion = new StringTokenizer(questionOption, "*");//splitting option that are fused in a single string using delimiter

                        get = tokenQuestion.nextToken(); //getting question string
                        opt1 = tokenQuestion.nextToken(); // getting optionA
                        opt2 = tokenQuestion.nextToken();// getting optionB
                        opt3 = tokenQuestion.nextToken();// getting optionC
                        opt4 = tokenQuestion.nextToken();// getting optionD

                        sol_n.add(solvE); //adding to the arrayList
                        q_display.add(new Question(get, opt1, opt2, opt3, opt4)); // adding to the arraylist

                    }


                    System.out.println(runner1.isAlive());
                    runner1.start(); // starting thre
                    System.out.println(runner1.isAlive());
                    System.out.println(runner1.isAlive());



                } catch (FileNotFoundException ex) {

                }
                
                startExam.setEnabled(true); // enabling Start exam button
            }

        });
        //System.out.println("after start");

        abandon = new JButton("Abandon Exam"); // creating button to stop current exam
        abandon.setBounds(770, 400, 130, 30); // setting boundary for JButton
        abandon.setOpaque(true); 
        abandon.setBackground(new Color(217, 30, 24)); // setting Background color
        abandon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abandoned = true;
            }

        });
        c.add(abandon); // adding abandon button to the container

        this.setVisible(true); // making frame visible
    }

    /**
     * This class defines a question. It has String data fields for question and
     * options.
     */
    class Question {

        private String ques, opt1, opt2, opt3, opt4;

        /**
         * constructor for Question, initializes fields to null.
         */
        Question() {
            ques = opt1 = opt2 = opt3 = opt4 = null; // initializing to null
        }

        /**
         * constructor for Question, initializes fields with specific values
         *
         * @param ques receives question as a String
         * @param opt1 receives Option no. 1 as a String
         * @param opt2 receives Option no. 2 as a String
         * @param opt3 receives Option no. 3 as a String
         * @param opt4 receives Option no. 4 as a String
         */
        Question(String ques, String opt1, String opt2, String opt3, String opt4) {
            this.ques = ques;
            this.opt1 = opt1;
            this.opt2 = opt2;
            this.opt3 = opt3;
            this.opt4 = opt4;
        }

        /**
         * @return returns question
         */
        public String getQues() {
            return ques;
        }

        /**
         * @param ques receives question
         */
        public void setQues(String ques) {
            this.ques = ques;
        }

        /**
         * @return returns Option 1
         */
        public String getOpt1() {
            return opt1;
        }

        /**
         * @param opt1 receives Option 1
         */
        public void setOpt1(String opt1) {
            this.opt1 = opt1;
        }

        /**
         * @return returns Option 2
         */
        public String getOpt2() {
            return opt2;
        }

        /**
         * @param opt2 receives Option 2
         */
        public void setOpt2(String opt2) {
            this.opt2 = opt2;
        }

        /**
         * @return returns Option 3
         */
        public String getOpt3() {
            return opt3;
        }

        /**
         * @param opt3 receives Option 3
         */
        public void setOpt3(String opt3) {
            this.opt3 = opt3;
        }

        /**
         * @return returns Option 4
         */
        public String getOpt4() {
            return opt4;
        }

        /**
         * @param opt4 receives Option 4
         */
        public void setOpt4(String opt4) {
            this.opt4 = opt4;
        }

    }

    /**
     * This class extends class "Thread" and Overrides method run()
     */
    class Runner extends Thread {

        @Override
        /**
         * This method contains the task that has to be done in a different
         * Thread , or more specifically it displays the question and options in
         * Student Frame and waits for 7 seconds for the student to submit
         * answer
         */
        public void run() { // another Thread for displaying qustions to the student in a loop
            Question qq; // declaring Question reference variable
            for (int i = 0; i < q_display.size() && !abandoned; i++) { // iterating through arrayList


                toSleep = false;
                question.setText("Question: " + questionCount + " out of " + q_display.size()); // setting jlabel text
                qq = q_display.get(i); // getting question to display from arraylist
                question_display.setText(qq.getQues()); // setting text for TextArea
                optionA.setText(qq.getOpt1());//setting text for Option A
                optionB.setText(qq.getOpt2());//setting text for Option B
                optionC.setText(qq.getOpt3());//setting text for Option C
                optionD.setText(qq.getOpt4());//setting text for Option D

                do {
                    //if (i != (q_display.size() - 1)) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    //}
                }while(!toSleep);



                questionCount++;
                if(i == q_display.size() - 1) {
                    abandoned = true;
                }
            }
        }
        

    }

    /**
     * This method receives the answer of the student and confirms whether the
     * student is correct or wrong
     *
     * @param ab receives the answer of the student as a String
     * @return returns 'true' if the student is correct and 'false' otherwise
     */
    public boolean check(String ab) {

        for (String a : sol_n) {
            if (ab.equals(a)) {
                return true;
            }
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
                t_que_name_o.add(n);
            }

        } catch (FileNotFoundException ex) {
            
        }

        String[] questionName = new String[t_que_name_o.size()]; // declaring and creating String[]
        t_que_name_o.toArray(questionName); // from arrayList to -> Array

        return questionName;

    }
    

}
