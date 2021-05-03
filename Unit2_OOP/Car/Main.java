package Unit2_OOP.Car;

public class Main {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver's side door";
        dd.checkStatus();
        dd.open();
        dd.checkStatus();
        dd.close();
        dd.checkStatus();
    }
}
