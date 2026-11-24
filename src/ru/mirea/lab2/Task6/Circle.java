package ru.mirea.lab2.Task6;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // S круга
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // l окружности
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    // Сравнение двух окружностей
    public boolean isBigger(Circle other) {
        return this.radius > other.radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}