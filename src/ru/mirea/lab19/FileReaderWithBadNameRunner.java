package ru.mirea.lab19;

public class FileReaderWithBadNameRunner {
    public static void main(String[] args) {
        FileReaderWithBadName reader = new FileReaderWithBadName();
        try {
            System.out.println(reader.readFirstLine("no_such_file.txt"));
        } catch (BadFileNameException e) {
            System.out.println("Пользовательское исключение: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
        }
    }
}