package ru.mirea.lab2.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball mua = new Ball(3.0, 2.0);
        System.out.println("Начальное положение: " + mua);

        mua.move(4.0, -2.0);
        System.out.println("После перемещения: " + mua);

        mua.setXY(10.0, 10.0);
        System.out.println("После setXY: " + mua);
    }
}

