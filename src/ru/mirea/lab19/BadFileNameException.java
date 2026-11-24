package ru.mirea.lab19;

public class BadFileNameException extends Exception {
    public BadFileNameException(String errorMessage) {
        super(errorMessage);
    }

    public BadFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}