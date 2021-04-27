import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int guesses = 0;
        int num = 0;
        int int_random = rand.nextInt(num);
        System.out.print("This is a game where you must guess the number," +
                "but the catch is we will only tell you whether you are higher or lower.");
        Scanner input = new Scanner (System.in);
        int flow = input.nextInt();
        while (guesses < 10) {
            System.out.println("Please guess a number between 1 and 100");
            if (flow > num) {
                System.out.println("Sorry your guess was too high, try guessing lower.");
                guesses++;
            } else if (flow < num) {
                System.out.println("Unfortunately you guessed too low, please guess higher.");
                guesses++;
            } else {
                System.out.println("You're a good guesser. You got the number correct.");
            }
        }
    }
}