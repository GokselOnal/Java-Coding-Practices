import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static final String NAME = "Goksel";
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String guess;
        int tries = 0;
        do{
            System.out.print("Guess my name: ");
            guess = console.nextLine();
            tries++;
        }while (!guess.equals(NAME));
        System.out.println("Congratulations, you guessed my name correctly on the "+ tries + " try");
    }
}
