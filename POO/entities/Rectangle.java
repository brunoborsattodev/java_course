package POO.entities;

public class Rectangle {

    public double height;
    public double width;


    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString(){
        return String.format(
                 "AREA = %.2f\n" +
                 "PERIMETER = %.2f\n" +
                 "DIAGONAL = %.2f",
                + calculateArea(),
                + calculatePerimeter(),
                + calculateDiagonal()
        );
    }
}
