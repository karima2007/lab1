package ru.mirea.lab19.Task2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}