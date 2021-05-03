package Unit1_fundamentals.Conditional_statements;
import java.util.Scanner;

import java.util.Scanner;

public record If_statements() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height for roller coaster: ");
        double height = scanner.nextDouble();

        if (height > 5.2 && height < 7.5){
            System.out.println("You can ride the coaster.");
        }
        else if (height < 0 || height > 10){
            System.out.println("enter a valid height");
             height = scanner.nextDouble();
        }
        else {
            System.out.println("You do not meet the height requirements");
        }
    }
}
