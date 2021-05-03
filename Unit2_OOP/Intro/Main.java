package Unit2_OOP.Intro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thing thing = new Thing();
        Thing thing2 = new Thing();
        thing.num = 1;
        thing.word = "Thing number one";
        thing2.num = 2;
        thing2.word = "Thing number two";

        System.out.printf(thing.word + " " + thing2.word );


    }
}
