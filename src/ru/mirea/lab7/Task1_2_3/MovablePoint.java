package ru.mirea.lab7.Task1_2_3;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y = y - ySpeed;
    }

    @Override
    public void moveDown() {
        y = y + ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    public boolean speedTest(MovablePoint other) {
        if (this.xSpeed == other.xSpeed && this.ySpeed == other.ySpeed) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ") speed(" + xSpeed + ", " + ySpeed + ")";
    }
}
