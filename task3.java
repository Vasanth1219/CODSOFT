import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class task3 {
    public static void main(String[] args) {
        String[][] quizzes = {
            {"What is the capital of France?", "A. Berlin", "B. Madrid", "C. Paris", "D. Rome", "C"},
            {"Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Jupiter", "D. Saturn", "B"},
            {"Who wrote 'Hamlet'?", "A. Charles Dickens", "B. William Shakespeare", "C. Mark Twain", "D. Jane Austen", "B"},
            {"What is the largest ocean on Earth?", "A. Atlantic", "B. Pacific", "C. Indian", "D. Arctic", "B"},
            {"What is the chemical symbol for water?", "A. CO2", "B. H2O", "C. O2", "D. NaCl", "B"}
        };

        int score = 0;
        int correctCount = 0;
        int incorrectCount = 0;
        int timeLimitPerQuestion = 10; // 10 seconds per question
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < quizzes.length; i++) {
            final boolean[] timeOut = {false}; // Use an array to modify within the TimerTask
            System.out.println("Question " + (i + 1) + ": " + quizzes[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(quizzes[i][j]);
            }

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    timeOut[0] = true;
                }
            }, timeLimitPerQuestion * 1000);

            System.out.print("Select your answer (A/B/C/D): ");
            char answer = sc.next().toUpperCase().charAt(0);

            timer.cancel(); // Stop the timer once the user inputs their answer

            if (timeOut[0]) {
                System.out.println("Time's up!");
                incorrectCount++;
            } else if (answer == quizzes[i][5].charAt(0)) {
                System.out.println("Correct!");
                score++;
                correctCount++;
            } else {
                System.out.println("Incorrect.");
                incorrectCount++;
            }

            System.out.println();
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + quizzes.length);
        System.out.println("Correct Answers: " + correctCount);
        System.out.println("Incorrect Answers: " + incorrectCount);
        sc.close();
    }
}
