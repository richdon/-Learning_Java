package Unit1_fundamentals.Print_statements;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = sc.nextLine();
        System.out.printf("you entered: %s", input);
    }
}
