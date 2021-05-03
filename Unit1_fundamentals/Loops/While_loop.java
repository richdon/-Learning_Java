package Unit1_fundamentals.Loops;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int max = 5;
        int min = 1;
        int count = 1;
        // generates a random num between 1 - 5 then adds then adds 1 to make inclusive then adds 15 to that value to put in the desired range
        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.print("Guess the random chosen number between 1 and 5: " + randomNum + " ");
        int num = sc.nextInt();

        if (num == randomNum) {
            System.out.println("You guessed correctly! on the " + count + " attempt");
        }
        else {
            while (num != randomNum) {
                count ++;
                System.out.println("You guess incorrect, try again: ");
                num = sc.nextInt();
                if (num == randomNum){
                    System.out.println("You got it right on the " + count +" attempt.");
                    break;
                }


            }
        }
    }
}