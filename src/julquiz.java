import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class julquiz{
    public static void main(String[] args){
        String[] questions = {"Är du redo? /n1) ja /n2) nej", "test2"};
        int[] correctanswears = {1, 2};
        System.out.println(questions[1]);

        Scanner input = null;
        try {
            input = new Scanner(new File("frågor.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> moreQuestions = new ArrayList<>();
        ArrayList<String> moreAnswers = new ArrayList<>();
        ArrayList<Integer> moreCorrectAnswers = new ArrayList<>();

        while (input.hasNext()) {
            moreQuestions.add(input.nextLine());
            moreAnswers.add(input.nextLine());
            moreCorrectAnswers.add(input.nextInt());
            input.nextLine();
        }
    }
}