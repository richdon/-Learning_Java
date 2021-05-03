package Unit1_fundamentals.Loops;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Do_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.println("Roll again?");
            again = sc.next();
        } while (again.toLowerCase().equals("y"));
    }
}
