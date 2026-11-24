package ru.mirea.lab2.Task3;

public class Tester {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new Circle(new Point(1, 1), 10);
        circles[2] = new Circle(new Point(-2, 3), 2.5);

        System.out.println("кол элем в мас: " + circles.length);

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
            System.out.println("длина окруж: " + circles[i].getLength());
        }
    }
}