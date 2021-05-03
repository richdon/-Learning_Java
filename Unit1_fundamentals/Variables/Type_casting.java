package Unit1_fundamentals.Variables;

public class Type_casting {
    public static void main(String[] args) {

        // implicit type cast
        int foo = 5;
        double bar;
        bar = foo;
        // returns int
        System.out.println(foo);
        // returns double
        System.out.println(bar);

        double foo1 = 2.95;
        // type cast double to int cuts off the decimal
        int bar1 = (int)foo1;
        System.out.println(bar1);

        int x = 14;
        int y = 8;

        System.out.println((double) x / y);


    }
}
