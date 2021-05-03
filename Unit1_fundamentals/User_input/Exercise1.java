package Unit1_fundamentals.User_input;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.printf("You've lived %d years in another %d years you'll be " + 2*age + " years old.", age, age);

        System.out.println("You have " + firstName.length() + " letters in your name.");


    }
}
