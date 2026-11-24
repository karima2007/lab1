package ru.mirea.lab2.Task5;

public class ПитомникСобак {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Клаус", 2);
        dogs[1] = new Dog("Фина", 5);
        dogs[2] = new Dog("Тео", 1);

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}