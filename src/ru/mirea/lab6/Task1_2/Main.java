package ru.mirea.lab6.Task1_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("ном 1");
        MovablePoint p = new MovablePoint(0, 0, 1, 1);
        System.out.println(p);
        p.moveRight();
        p.moveDown();
        System.out.println(p);

        MovableCircle c = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println(c);
        c.moveLeft();
        c.moveUp();
        System.out.println(c);

        // --- Проверка задания 2 ---
        System.out.println("\n ном 2");
        MovableRectangle r = new MovableRectangle(0, 0, 10, 10, 1, 1);
        System.out.println(r);
        r.moveRight();
        r.moveDown();
        System.out.println(r);
        System.out.println("Скорости одинаковые? " + r.isSameSpeed());
    }
}