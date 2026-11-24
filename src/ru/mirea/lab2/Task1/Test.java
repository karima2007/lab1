package ru.mirea.lab2.Task1;

public class Test {
    public static void main(String[] args) {
        Author a1 = new Author("Карима Кадырова", "karimakadyrova@mail.ru", 'w');


        System.out.println("Имя: " + a1.getName());
        System.out.println("Почта: " + a1.getEmail());
        System.out.println("Пол: " + a1.getGender());


        a1.setEmail("newkarima@mail.ru");
        System.out.println("Новая почта: " + a1.getEmail());


        System.out.println(a1);


        Author a2 = new Author("Иван Петров", "ivanpetrov@mail.ru", 'm');
        System.out.println(a2.toString());
    }
}
