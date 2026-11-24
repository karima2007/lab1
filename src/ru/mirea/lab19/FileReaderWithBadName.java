package ru.mirea.lab19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderWithBadName {
    public static boolean isCorrectFileName(String fileName) {
        return fileName != null && fileName.endsWith(".txt");
    }

    public String readFirstLine(String fileName) throws BadFileNameException {
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine()) {
                return file.nextLine();
            }
        } catch (FileNotFoundException err) {
            if (!isCorrectFileName(fileName)) {
                throw new BadFileNameException("Bad filename: " + fileName, err);
            }
            throw new BadFileNameException("File not found: " + fileName, err);
        }
        return "";
    }
}