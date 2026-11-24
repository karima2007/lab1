package ru.mirea.lab6.Task3;


public class Main {
    public static void main(String[] args) {
        Nameable p = new Planets("луна");
        Nameable c = new Car("BMW");
        Nameable a = new Animals("собака");

        System.out.println(p.getName());
        System.out.println(c.getName());
        System.out.println(a.getName());
    }
}