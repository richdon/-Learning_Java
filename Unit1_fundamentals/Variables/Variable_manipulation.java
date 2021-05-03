package Unit1_fundamentals.Variables;

public class Variable_manipulation {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x);
        x = 32;
        System.out.println(x);
        x = -1000;
        System.out.println(x);

        int y = 3;

        System.out.println("x is " + x);

        y = x + y + x;
        System.out.println("y is " + y);

        System.out.println("result of 30 / 3 is: " + 30 / 3);

        int a = 15;
        int b = 4;
        int c = a/b;
        System.out.printf("integer division: 17 / 5 = %s %s"  , a/b, c);
        System.out.println("\n" + a/b);

        double z = 5;
        double k = 2;
        System.out.println(z/k);
    }
}

