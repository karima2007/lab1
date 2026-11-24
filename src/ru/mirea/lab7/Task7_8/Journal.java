package ru.mirea.lab7.Task7_8;

public class Journal implements Printable {
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
}