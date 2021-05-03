package Unit1_fundamentals.Loops;

import java.util.Arrays;
import java.util.List;

public class For_loop {
    public static void main(String[] args) {

        // for loop
        /*for (int i = 1;  i < 11; i++){
            System.out.println("Test iteration: " + i);
        }*/

        List<Integer> grades = Arrays.asList(100, 10, 70, 30, 67, 95);
        // for each loop
        for  (int grade : grades) {
            if (grade >= 65){
                System.out.println(grade + " is passing.");
            }
            else{
                System.out.println(grade + " is failing.");
            }

        }
    }
}
