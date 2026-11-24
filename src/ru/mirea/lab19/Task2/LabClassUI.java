package ru.mirea.lab19.Task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - добавить студента, 2 - сортировать, 3 - найти по ФИО, 0 - выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("ФИО: ");
                    String name = scanner.nextLine();
                    System.out.print("Средний балл: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();
                    labClass.addStudent(new Student(name, grade));
                    break;
                case 2:
                    labClass.sortByAverageGrade();
                    System.out.println("Отсортировано: " + labClass.getStudents());
                    break;
                case 3:
                    System.out.print("ФИО для поиска: ");
                    String searchName = scanner.nextLine();
                    try {
                        System.out.println("Найден: " + labClass.findByName(searchName));
                    } catch (EmptyStringException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    } catch (StudentNotFoundException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Неверный пункт меню");
            }
        }
        scanner.close();
    }
}