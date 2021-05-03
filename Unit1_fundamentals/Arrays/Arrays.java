package Unit1_fundamentals.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // array with initializer list
        int[] foo = {0, 0, 0};

        // same as above, initializes an array to size 3 with all values containing 0
        int[] bar = new int[3];


        Scanner sc = new Scanner(System.in);

        System.out.print("Number of laps: ");
        int numberOfLaps = sc.nextInt();

        double[] lapTimes = new double[numberOfLaps];
        double sumOfLaps = 0;


        for (int lap = 0 ; lap < lapTimes.length ; lap++){
            System.out.print("Enter the lap time: ");
            lapTimes[lap] = sc.nextDouble();
            sumOfLaps += lapTimes[lap];
        }

        double fastestLap = lapTimes[0];

        for (int lap = 0 ; lap < lapTimes.length ; lap++){
            if (lapTimes[lap] < fastestLap){
                fastestLap = lapTimes[lap];
            }
        }


        double meanOfLaps = sumOfLaps / lapTimes.length;
        System.out.printf("The total time of all " + numberOfLaps + "  laps is: %.2f, and the mean lap time is: %.2f" +
                           " and the fastest lap time is: %.2f", sumOfLaps, meanOfLaps, fastestLap);

    }
}
