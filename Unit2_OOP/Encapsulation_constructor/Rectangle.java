package Unit2_OOP.Encapsulation_constructor;

public class Rectangle {
    private int height;
    private int width;

    // constructor
    public Rectangle(int h, int w) {
        System.out.println("Rectangle created");
        setHeight(h);
        setWidth(w);
    }

    // setter method
    void setHeight(int h) {
        if (h > 0) {
            height = h;
        }
    }
    // setter method
    void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }
    // getter method
    public int getArea() {
        return (height * width);
    }
    // getter method
    public int getPerimeter(){
        return (2 * width + 2 * height);
    }
    // getter method
    public int getHeight(){
        return height;
    }
    // getter method
    public int getWidth(){
        return width;
    }

}

