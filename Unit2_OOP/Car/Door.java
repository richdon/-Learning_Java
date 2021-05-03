package Unit2_OOP.Car;

public class Door {
    boolean isOpen;
    String name;
    void open() {
        isOpen = true;
    }

    void close(){
        isOpen = false;
    }

    void checkStatus(){
        if (isOpen) {
            System.out.println(name + " Door is open.");
        }
        else {
            System.out.println(name + " Door is closed.");
        }
    }

}
