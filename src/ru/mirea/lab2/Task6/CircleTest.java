package ru.mirea.lab2.Task6;

public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);

        System.out.println("c1: " + c1);
        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Длина c1: " + c1.getLength());

        System.out.println("c2: " + c2);
        System.out.println("Площадь c2: " + c2.getArea());
        System.out.println("Длина c2: " + c2.getLength());

        if (c1.isBigger(c2)) {
            System.out.println("c1 больше c2");
        } else {
            System.out.println("c1 не больше c2");
        }
    }
}