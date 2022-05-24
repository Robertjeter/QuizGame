
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Question object;
        int test;
        object = new Question();
        Scanner numberInput = new Scanner(System.in);
        System.out.println();
        test = numberInput.nextInt();

        object.setQuestionNumber(test);
        object.setSubject(null);
        object.setListQuestions(null);
        object.setListSolutions(null);
        object.getListQuestions();
        object.getSolutionQuestions();
        System.out.print("hello");

    }

}


