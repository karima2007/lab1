package ru.mirea.lab17.Task123;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ГЛАВНОЕ МЕНЮ (ПР №17) ===");
            System.out.println("1. Работа с односвязным списком (Задание 1)");
            System.out.println("2. Работа с двусвязным списком (Задание 2)");
            System.out.println("3. Работа с кольцевым списком (Задание 2)");
            System.out.println("0. Выход");
            System.out.print("Выберите вариант: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1": runSinglyMenu(sc); break;
                case "2": runDoublyMenu(sc); break;
                case "3": runCircularMenu(sc); break;
                case "0": System.out.println("Выход..."); return;
                default: System.out.println("Неверный ввод.");
            }
        }
    }

    private static void showMenu(String title) {
        System.out.println("\n--- " + title + " ---");
        System.out.println("1. Добавить студента");
        System.out.println("2. Удалить студента по имени");
        System.out.println("3. Показать весь список");
        System.out.println("4. Очистить список");
        System.out.println("5. Проверить на пустоту");
        System.out.println("6. Сохранить в файл");
        System.out.println("7. Загрузить из файла");
    }

    private static void runSinglyMenu(Scanner sc) {
        SinglyLinkedList list = new SinglyLinkedList();
        while (true) {
            showMenu("Односвязный список");
            System.out.println("0. Назад в главное меню");
            System.out.print("Действие: ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("0")) return;
            if (handleCommonCommands(cmd, sc, list)) continue;
            System.out.println("Неверная команда.");
        }
    }

    private static void runDoublyMenu(Scanner sc) {
        DoublyLinkedList list = new DoublyLinkedList();
        while (true) {
            showMenu("Двусвязный список");
            System.out.println("8. Показать в обратном порядке");
            System.out.println("0. Назад в главное меню");
            System.out.print("Действие: ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("0")) return;
            if (cmd.equals("8")) { list.printReverse(); continue; }
            if (handleCommonCommands(cmd, sc, list)) continue;
            System.out.println("Неверная команда.");
        }
    }

    private static void runCircularMenu(Scanner sc) {
        CircularLinkedList list = new CircularLinkedList();
        while (true) {
            showMenu("Кольцевой список");
            System.out.println("0. Назад в главное меню");
            System.out.print("Действие: ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("0")) return;
            if (handleCommonCommands(cmd, sc, list)) continue;
            System.out.println("Неверная команда.");
        }
    }

    // Вспомогательный метод, чтобы не дублировать код меню для трех списков
    private static boolean handleCommonCommands(String cmd, Scanner sc, Object listObj) {
        try {
            if (cmd.equals("1")) {
                Student s = new Student();
                s.readFromConsole(sc);
                if (listObj instanceof SinglyLinkedList) ((SinglyLinkedList) listObj).add(s);
                else if (listObj instanceof DoublyLinkedList) ((DoublyLinkedList) listObj).add(s);
                else if (listObj instanceof CircularLinkedList) ((CircularLinkedList) listObj).add(s);
                System.out.println("Студент добавлен.");
            } else if (cmd.equals("2")) {
                System.out.print("Введите имя для удаления: ");
                String name = sc.nextLine().trim();
                boolean removed = false;
                if (listObj instanceof SinglyLinkedList) removed = ((SinglyLinkedList) listObj).remove(name);
                else if (listObj instanceof DoublyLinkedList) removed = ((DoublyLinkedList) listObj).remove(name);
                else if (listObj instanceof CircularLinkedList) removed = ((CircularLinkedList) listObj).remove(name);
                System.out.println(removed ? "Удалено." : "Студент с таким именем не найден.");
            } else if (cmd.equals("3")) {
                if (listObj instanceof SinglyLinkedList) ((SinglyLinkedList) listObj).printAll();
                else if (listObj instanceof DoublyLinkedList) ((DoublyLinkedList) listObj).printAll();
                else if (listObj instanceof CircularLinkedList) ((CircularLinkedList) listObj).printAll();
            } else if (cmd.equals("4")) {
                if (listObj instanceof SinglyLinkedList) ((SinglyLinkedList) listObj).clear();
                else if (listObj instanceof DoublyLinkedList) ((DoublyLinkedList) listObj).clear();
                else if (listObj instanceof CircularLinkedList) ((CircularLinkedList) listObj).clear();
                System.out.println("Список очищен.");
            } else if (cmd.equals("5")) {
                boolean empty = false;
                if (listObj instanceof SinglyLinkedList) empty = ((SinglyLinkedList) listObj).isEmpty();
                else if (listObj instanceof DoublyLinkedList) empty = ((DoublyLinkedList) listObj).isEmpty();
                else if (listObj instanceof CircularLinkedList) empty = ((CircularLinkedList) listObj).isEmpty();
                System.out.println(empty ? "Список пуст." : "Список содержит элементы.");
            } else if (cmd.equals("6")) {
                System.out.print("Имя файла для сохранения: ");
                String f = sc.nextLine().trim();
                if (listObj instanceof SinglyLinkedList) ((SinglyLinkedList) listObj).saveToFile(f);
                else if (listObj instanceof DoublyLinkedList) ((DoublyLinkedList) listObj).saveToFile(f);
                else if (listObj instanceof CircularLinkedList) ((CircularLinkedList) listObj).saveToFile(f);
                System.out.println("Сохранено.");
            } else if (cmd.equals("7")) {
                System.out.print("Имя файла для загрузки: ");
                String f = sc.nextLine().trim();
                if (listObj instanceof SinglyLinkedList) ((SinglyLinkedList) listObj).loadFromFile(f);
                else if (listObj instanceof DoublyLinkedList) ((DoublyLinkedList) listObj).loadFromFile(f);
                else if (listObj instanceof CircularLinkedList) ((CircularLinkedList) listObj).loadFromFile(f);
                System.out.println("Загружено.");
            } else {
                return false;
            }
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return true;
        }
    }
}
