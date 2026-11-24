package ru.mirea.lab6.Task1_2;


public class MovableCircle implements Movable {
    int radius;
    MovablePoint center; // центр круга — это MovablePoint


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableCircle radius=" + radius + " center=" + center.toString();
    }


    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
