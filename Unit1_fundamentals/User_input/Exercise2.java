package Unit1_fundamentals.User_input;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total bill: ");
        double billAmount = scanner.nextDouble();

        System.out.println("Enter number of people: ");
        int persons = scanner.nextInt();

        double total = billAmount/persons;

        System.out.printf("Each person should pay: %.2f", total);
    }
}
