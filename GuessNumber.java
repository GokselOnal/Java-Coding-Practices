import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Random rand = new Random();
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int guess = 0, tries = 0;
        int random = rand.nextInt(10) +1;
        System.out.println("asdfasdfa: " + random);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        while (random != guess){
            System.out.print("Your guess: ");
            guess = console.nextInt();
            tries++;
        }
        System.out.println("That's right! You're a good guesser.\nIt only took you " + tries + " tries.");
    }
}
