import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishQuestion englishQuestion = new EnglishQuestion("What is verb?");

        englishQuestion.setAns("Verb is action of a sentence.");
        englishQuestion.setMark(50);
        englishQuestion.setTime(10);


        Scanner scanner = new Scanner(System.in);
        englishQuestion.printQuestionForStudents();
        System.out.print("Please write your answer: ");
        String ans = scanner.nextLine();

        System.out.println("\n");

        englishQuestion.showResult(ans);

        System.out.println("\n");

        System.out.println("The solution of your exam:");
        englishQuestion.printQuestionDetails();
    }
}