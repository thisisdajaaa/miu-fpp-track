package lesson5.prog1;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected double calculateArea() {
        return 0.0;
    }

    protected double calculatePerimeter() {
        return 0.0;
    }
}
