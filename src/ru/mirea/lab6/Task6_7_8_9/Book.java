package ru.mirea.lab6.Task6_7_8_9;

public class Book implements Printable {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("книга: " + title);
    }
}
