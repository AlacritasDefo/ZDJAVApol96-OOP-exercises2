package pl.sda.zadanie7;

public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(10.5);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
    }
}
