package Unit1_fundamentals.User_input;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you?");
        int userAge =scanner.nextInt();
        System.out.println("Your name is " + userName + " and you're " + userAge + " years old.");

        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.printf("%s, You're %s feet tall.", userName, userHeight);


        System.out.println(4.5 - 2.7);

        System.out.format("I have %d cat", 1);
        System.out.printf("\nI have %d cats, %d dogs, and %.2f %s", 2, 4, 3.14159,"hippo");


        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFeMaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.printf( "%.2f if you're female", averageFeMaleHeightDifference);
        System.out.printf( "\n%.2f if you're male", averageMaleHeightDifference);
        */

        Scanner scanner = new Scanner(System.in);

        String singleTokenInput = scanner.next();
        String multiTokenInput = scanner.nextLine();
        System.out.printf(" the first token is: %s \n The rest of the tokens are: %s ", singleTokenInput, multiTokenInput);


    }

}
