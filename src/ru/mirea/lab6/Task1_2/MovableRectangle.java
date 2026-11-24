package ru.mirea.lab6.Task1_2;


public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Проверка, что скорости одинаковые
    public boolean isSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed
                && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public String toString() {
        return "MovableRectangle topLeft=" + topLeft.toString()
                + " bottomRight=" + bottomRight.toString();
    }

    public void moveUp() {
        if (isSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("скорости разные, движение невозможно!");
        }
    }

    public void moveDown() {
        if (isSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            System.out.println("скорости разные, движение невозможно");
        }
    }

    public void moveLeft() {
        if (isSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            System.out.println("скорости разные, движение невозможно!");
        }
    }

    public void moveRight() {
        if (isSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            System.out.println("скорости разные, движение невозможно!");
        }
    }
}