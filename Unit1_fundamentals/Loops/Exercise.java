package Unit1_fundamentals.Loops;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        /*for (int i = 89 ; i <= 117; i++){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 1 ; i <= 40; i++){
            if (i % 3 == 0){
                System.out.println(i + " Quack");
            }
            else {
                System.out.println(i);
            }*/

        Scanner sc = new Scanner(System.in);

        String pw = "shark50";
        String userEntry;

        do {
            System.out.print("Enter the access password: ");
            userEntry = sc.next();
            if (userEntry.equals(pw)) {
                System.out.print("Success!");
                break;
            } else {
                System.out.println("Incorrect. Try again.");
            }
        } while (userEntry != pw);
    }
}
