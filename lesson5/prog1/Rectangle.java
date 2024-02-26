package lesson5.prog1;

public class Rectangle extends Shape {
    protected Double width;
    protected Double height;

    public Rectangle(String color, Double width, Double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
