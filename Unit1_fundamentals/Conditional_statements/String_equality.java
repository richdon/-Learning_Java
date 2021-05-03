package Unit1_fundamentals.Conditional_statements;
import java.util.Locale;
import java.util.Scanner;
public class String_equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to VIP lounge");
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

/*
        if (age >= 21 && userReply.equals("yes")){
            System.out.println("You may enter the lounge");
        }
        else{
            System.out.println("SORRY, NO CAN DO!");
        }
*/
        if (age >= 21){
            System.out.print("Do you have a VIP pass? yes/no: ");
            String userReply = scanner.next().toLowerCase();
            if (userReply.equals("yes"))
            {
                System.out.println("You may enter the lounge");
            }
            else
            {
                System.out.println("You may not enter because you have no pass.");
            }
        }
        else{
            System.out.println(" You are too young to enter.");
            }
        }
    }

