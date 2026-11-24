package ru.mirea.lab17.Task124;
import java.util.Scanner;

public class StudentListTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList list;

        System.out.println("Выберите вид списка:");
        System.out.println("1 - Односвязный");
        System.out.println("2 - Двусвязный");
        System.out.println("3 - Кольцевой");

        String structure = scanner.nextLine();

        if (structure.equals("1")) {
            list = new SinglyStudentList();
        } else if (structure.equals("2")) {
            list = new DoublyStudentList();
        } else if (structure.equals("3")) {
            list = new CircularStudentList();
        } else {
            System.out.println("Неверный вариант");
            scanner.close();
            return;
        }

        boolean working = true;

        while (working) {
            System.out.println("1 - Добавить студента");
            System.out.println("2 - Удалить студента по номеру");
            System.out.println("3 - Вывести список");
            System.out.println("4 - Очистить список");
            System.out.println("5 - Проверить список на пустоту");
            System.out.println("0 - Выход");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Student student = new Student();
                    student.readFromConsole(scanner);
                    list.add(student);
                    System.out.println("Студент добавлен");
                    break;

                case "2":
                    System.out.print("Введите номер студента: ");
                    int idNumber = Integer.parseInt(scanner.nextLine());

                    if (list.removeById(idNumber)) {
                        System.out.println("Студент удалён");
                    } else {
                        System.out.println("Студент не найден");
                    }
                    break;

                case "3":
                    list.displayAll();
                    break;

                case "4":
                    list.clear();
                    System.out.println("Список очищен");
                    break;

                case "5":
                    if (list.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println("Список не пуст");
                    }
                    break;

                case "0":
                    working = false;
                    break;

                default:
                    System.out.println("Неправильный выбор");
                    break;
            }
        }

        scanner.close();
    }
}
