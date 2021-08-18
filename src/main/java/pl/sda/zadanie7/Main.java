package pl.sda.zadanie7;

import pl.sda.zadanie2.DivisionOperation;

public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(10.5);
        Resizablecircle radius = new Resizablecircle(20);
        DivisionOperation divisionOperation = new DivisionOperation();

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        radius.resize(50);
        System.out.println("resized radius: " + radius.getRadius());

        System.out.println("Division: " + divisionOperation.calculate(1, -1));

    }
}
