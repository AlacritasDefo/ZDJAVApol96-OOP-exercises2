package pl.sda.zadanie7;

public class Resizablecircle implements Resizable{
    private double radius;

    @Override
    public void resize(int percent) {
        radius = radius*percent/100;
    }

    public Resizablecircle (double radius) {this.radius = radius;}

    public double getRadius() {
        return radius;
    }
}
