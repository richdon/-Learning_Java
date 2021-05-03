package Unit1_fundamentals.Conditional_statements;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        switch(Character.toLowerCase(letter)){
            case  'a':
                System.out.println("you entered A or a.");
                break;
            case 'b':
                System.out.println("You entered B or b.");
                break;
            default:
                System.out.println("Invalid entry.");
                break;

        }
    }
}
