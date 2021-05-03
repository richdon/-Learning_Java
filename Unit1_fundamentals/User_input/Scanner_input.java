package Unit1_fundamentals.User_input;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {

        // create a new Scanner object to read from input keyboard
        // name the Scanner object 'scanner"     // new Scanner object
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.printf("you entered: %s", input);

    }
}
