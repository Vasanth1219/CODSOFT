import java.util.*;

class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int roundsPlayed = 0;
        String playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 3;
            boolean hasWon = false;

            System.out.println("Guess the number between 1 and 100. You have " + attempts + " attempts.");

            for (int i = 0; i < attempts; i++) {
                System.out.println("You have only 3 attempts to guess the number");
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    userScore++;
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, you've used all attempts. The correct number was: " + numberToGuess);
            }

            roundsPlayed++;
            System.out.println("Rounds played: " + roundsPlayed + ", Rounds won: " + userScore);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing! Final score: " + userScore + " out of " + roundsPlayed);
        scanner.close();
    }
}
