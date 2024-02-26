package lesson3.prog3;

public class Rectangle {
    private Double width;
    private Double length;

    public Rectangle() {}

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}
