package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static List<String> getDirectoryContents(String path) {
        List<String> fileList = new ArrayList<>();
        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            }
        } else {
            System.out.println("Каталог не найден: " + path);
        }
        return fileList;
    }

    public static void main(String[] args) {
        // Используем текущую директорию проекта (или укажите свой путь, например "C:\\Windows")
        String currentDirPath = System.getProperty("user.dir");
        List<String> contents = getDirectoryContents(currentDirPath);

        System.out.println("Всего элементов найдено: " + contents.size());
        System.out.println("Первые 5 элементов:");

        for (int i = 0; i < Math.min(5, contents.size()); i++) {
            System.out.println((i + 1) + ". " + contents.get(i));
        }
    }
}