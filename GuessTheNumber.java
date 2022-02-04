import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {

        int ourGuess;

        int computerNumber;

        int guessCount = 0;

        Random random = new Random();

        boolean guessedNumber = false;

        Scanner keyboard = new Scanner(System.in);


        computerNumber = random.nextInt(188) + 1;

        while (!guessedNumber) {

            System.out.println("Enter your integer guess");

            ourGuess = keyboard.nextInt();

            guessCount++;

            if (ourGuess >= 1 && ourGuess <= 188) {

                if (ourGuess == computerNumber) {
                    System.out.println("Congrats! You guessed the number in " + guessCount + " guesses.");
                    System.exit(0);
                }

            else if (ourGuess > computerNumber) {
                System.out.println("Your guess is too High!");
            }
            else if (ourGuess < computerNumber) {
                System.out.println("Your guess is too Low!");
            }

        }

else{
                System.out.println("That was a wasted guess! Pick between 1 and 188");
            }
        }
    }
}