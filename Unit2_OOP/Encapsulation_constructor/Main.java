package Unit2_OOP.Encapsulation_constructor;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5 , 10);
        System.out.println("Area of r1 is: " +r1.getArea());
        System.out.println("Perimeter of r1 is: " +r1.getPerimeter());

        
        Rectangle r2 = new Rectangle(7, 4);
        System.out.println("Area of r2 is: " + r2.getArea());
        System.out.println("Perimeter of r2 is: " + r2.getPerimeter());

    }
}
