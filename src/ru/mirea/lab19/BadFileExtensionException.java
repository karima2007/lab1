package ru.mirea.lab19;

public class BadFileExtensionException extends RuntimeException {
    public BadFileExtensionException(String errorMessage) {
        super(errorMessage);
    }

    public BadFileExtensionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}