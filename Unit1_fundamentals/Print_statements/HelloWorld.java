package Unit1_fundamentals.Print_statements;

// main class
public class HelloWorld {

    //main method header
    public static void main(String[] args) {
	// method body
        System.out.print("Hello World!\n");
        System.out.print("Cat\n");
        System.out.println("Dog");
        System.out.println("Rab\n\t\tbit");

        // \n - newline
        // \t - tab
        // \b - backspace

        // the dog said "Woof", then rolled around.
        System.out.println("the dog said \"Woof\", then rolled around.");

        // c:\User\Desktop
        System.out.println("c:\\User\\Desktop");

        // method call
        hazelnut();
    }

    public static void hazelnut() {
        System.out.println("Tree");
        System.out.println("Grass");
    }

}
