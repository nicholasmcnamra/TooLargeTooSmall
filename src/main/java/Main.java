import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        int userGuess = 0;
        int numberGuesses = 0;
        int randInt;
        int lastGuess;
        Scanner scanner = new Scanner(System.in);



        randInt = Game.generateRandomNumber(100);
        System.out.println("Take a guess!");

        while(userGuess != randInt) {
            lastGuess = userGuess;
            userGuess = scanner.nextInt();
            if (userGuess != lastGuess) {
                numberGuesses++;
            }

            if (userGuess == randInt) {
                System.out.println("correct guess\nYou got it in " + numberGuesses + " of guesses");

            }
            else if (userGuess > randInt) {
                System.out.println("too large\nTake another guess");
            }
            else {
                System.out.println("too small\nTake another guess");
            }
        }

    }
}
