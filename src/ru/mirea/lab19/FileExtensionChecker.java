package ru.mirea.lab19;

public class FileExtensionChecker {
    public void checkExtension(String fileName) {
        if (fileName == null || !fileName.contains(".")) {
            throw new BadFileExtensionException("Файл не содержит расширения: " + fileName);
        }
        System.out.println("Расширение файла корректно: " + fileName);
    }
}