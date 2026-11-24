package ru.mirea.lab6.Task1_2;


public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // Конструктор
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Метод toString
    public String toString() {
        return "MovablePoint(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // Реализация методов интерфейса
    public void moveUp() {
        y = y - ySpeed;
    }

    public void moveDown() {
        y = y + ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }
}