import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Game {


    //Write a guessing game which prompts a user to guess a mystery number within some range.
    //After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
    //Upon termination, the program should display the number of guesses before successfully guessing correctly.
    //A number that is input consecutively, should register as a single guess.

    static Random randomNumber = new Random();
    static int randInt;
    int userGuess = 0;
    static Scanner scanner = new Scanner(System.in);
//    public Game() {
//
//    }
    public static int generateRandomNumber(int randInt) {
        randInt = randomNumber.nextInt(100);
        return randInt;
    }

    public static void tooLargeTooSmall(int userGuess) {
        userGuess = scanner.nextInt();

        if (userGuess == randInt) {
            System.out.println("correct guess");
        }
        else if (userGuess > randInt) {
            System.out.println("too large");
        }
        else {
            System.out.println("too small");
            }
    }

}
