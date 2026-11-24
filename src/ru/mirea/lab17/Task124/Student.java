package ru.mirea.lab17.Task124;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String name;
    private double gpa;

    Student next;
    Student previous;

    public Student() {
    }

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void readFromConsole(Scanner scanner) {
        System.out.print("Номер студента: ");
        idNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Имя студента: ");
        name = scanner.nextLine();
        System.out.print("Средний балл: ");
        gpa = Double.parseDouble(scanner.nextLine());
    }

    public void display() {
        System.out.println("Номер: " + idNumber + ", имя: " + name + ", средний балл: " + gpa);
    }
    @Override
    public int compareTo(Student other) {
        if (idNumber < other.idNumber) {
            return -1;
        }
        if (idNumber > other.idNumber) {
            return 1;
        }
        return 0;
    }
}
