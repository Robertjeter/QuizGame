

import java.util.Scanner;

public class Question {
    protected static int QUESTIONNUMBER;
    private String subject, questionElements, solutionElements;
    protected static String [] LISTQUESTIONS, LISTSOLUTIONS;

    public Question () { // Constructor of the Question class that initializes the variables
        QUESTIONNUMBER = 0;
        subject = "empty";
        LISTQUESTIONS = null; // this constant is not assigned to a value yet
        LISTSOLUTIONS = null;

    }
    public void setQuestionNumber(int qN) { // Getting the number of questions from the teacher
        QUESTIONNUMBER = qN;
        System.out.print("The number of questions you enter are: " + qN);
        System.out.println();tting the subject
        subject = s;
        System.out.println("What is the subject that you would like to test the students on?");
        Scanner subjectInput = new Scanner(System.in);
        s = subjectInput.nextLine();
        System.out.println("The students will be tested on: " + s);
    }
    public void setListQuestions(String[] lQ){
        Scanner listInput = new Scanner(System.in);
    }
    public void setSubject(String s) { // Taking the subject from teacher and outpu
        questionElements = listInput.nextLine();
        lQ = new String[QUESTIONNUMBER]; // Setting the length of the list array (lQ)
        System.out.println("Enter the questions for the students");
        for(int i = 0; i < QUESTIONNUMBER; i++) {
            lQ[i] = listInput.nextLine();
        }
        LISTQUESTIONS = lQ;
    }
    public void setListSolutions(String[] sQ){
        Scanner solutionInput = new Scanner(System.in);
        solutionElements = solutionInput.nextLine();
        sQ = new String[QUESTIONNUMBER]; // Setting the length of the solution array(sQ) same as the list array
        System.out.print("What is the solution to that question?");
        for(int i = 0; i < QUESTIONNUMBER; i++) {
            sQ[i] = solutionInput.nextLine();
        }
        LISTSOLUTIONS = sQ;
    }
    public String getListQuestions() {
        System.out.print("The questions are: ");
        for(int i = 0; i < QUESTIONNUMBER; i++) {
            System.out.println(LISTQUESTIONS[i]);

        }
        return "0";
    }
    public String getSolutionQuestions() {
        for(int i = 0; i < QUESTIONNUMBER; i++) {
            System.out.println(LISTSOLUTIONS[i]);
        }
    return "0";
    }





}

