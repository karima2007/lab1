package ru.mirea.lab2.Task3;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Длина окружности
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
}