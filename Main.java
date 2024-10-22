import java.util.Random;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);  // Corrected the syntax
        int guess;
        System.out.println("Enter your first guess:"); // Corrected the syntax
        guess = scan.nextInt();
        int count = 0; // Count the number of times user guesses

        while (guess != x && count < 10) {  // Added condition to prevent infinite loop
            if (guess < x) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            count++;
            if (count < 10) {
                System.out.println("Try again:");
                guess = scan.nextInt();
            }
        }

        // Check if user guessed correctly
        if (guess == x) {
            if (count <= 7) {
                System.out.println("You got an impossibly good score!");
            } else if (count <= 10) {
                System.out.println("You did a good job!");
            }
        } else {
            System.out.println("Try the divide and conquer strategy next time!");
        }

        scan.close(); // Close the scanner to avoid resource leaks
    }
}
