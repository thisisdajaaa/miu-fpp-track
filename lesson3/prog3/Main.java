package lesson3.prog3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Select an option");
            System.out.println("Enter A for Circle");
            System.out.println("Enter B for Rectangle");
            System.out.println("Enter C for Triangle");
            System.out.println("Enter D for quitting");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "A":
                    Circle circle = new Circle();

                    System.out.println("Enter the radius of the circle");
                    double area = scanner.nextDouble();
                    scanner.nextLine();

                    circle.setRadius(area);

                    System.out.println("The area of the circle is: " + circle.getArea());
                    break;
                case "B":
                    Rectangle rectangle = new Rectangle();

                    System.out.println("Enter the width of the rectangle");
                    double width = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter the length of the rectangle");
                    double length = scanner.nextDouble();
                    scanner.nextLine();

                    rectangle.setWidth(width);
                    rectangle.setLength(length);

                    System.out.println("The area of the rectangle is: " + rectangle.getArea());
                    break;
                case "C":
                    Triangle triangle = new Triangle();

                    System.out.println("Enter the base of the triangle");
                    double base = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter the height of the triangle");
                    double height = scanner.nextDouble();
                    scanner.nextLine();

                    triangle.setBase(base);
                    triangle.setHeight(height);

                    System.out.println("The area of the triangle is: " + triangle.getArea());
                    break;
                case "D":
                    System.out.println("Exiting....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select an option again");
                    break;
            }
        }
    }
}
