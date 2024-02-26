package lesson5.prog1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Rectangle("Red", 5.0, 10.0),
                new Square("Blue", 5.0),
                new Circle("Red", 5.0),
                new Square("Blue", 5.0),
                new Circle("Red", 5.0),
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape: shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
