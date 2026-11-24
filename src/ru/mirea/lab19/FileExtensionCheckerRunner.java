package ru.mirea.lab19;

public class FileExtensionCheckerRunner {
    public static void main(String[] args) {
        FileExtensionChecker checker = new FileExtensionChecker();
        checker.checkExtension("document.txt");
        try {
            checker.checkExtension("document");
        } catch (BadFileExtensionException e) {
            System.out.println("Перехвачено непроверяемое исключение: " + e.getMessage());
        }
    }
}