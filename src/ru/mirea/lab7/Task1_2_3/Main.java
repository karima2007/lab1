package ru.mirea.lab7.Task1_2_3;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 10, 10, 2, 2);

        System.out.println("До движения: " + rect.toString());
        System.out.println("Скорости одинаковые? " + rect.speedTest());

        rect.moveRight();
        rect.moveDown();

        System.out.println("После движения: " + rect.toString());
    }
}