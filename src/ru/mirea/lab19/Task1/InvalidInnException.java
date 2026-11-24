package ru.mirea.lab19.Task1;

public class InvalidInnException extends Exception {
    public InvalidInnException(String errorMessage) {
        super(errorMessage);
    }
}