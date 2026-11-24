package ru.mirea.lab2.Task7;

public class BookTest {

    public static void main(String[] args) {
        // Создаём полку на 5 книг
        BookOpis shelf = new BookOpis(5);

        // Добавляем книги
        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));

        // Печатаем все книги
        System.out.println("\nВсе книги на полке:");
        shelf.printAll();

        // Самая поздняя и самая ранняя
        System.out.println("\nСамая поздняя книга: " + shelf.getLatestBook());
        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());

        // Сортируем по году
        shelf.sortByYear();
        System.out.println("\nПосле сортировки по году (по возрастанию):");
        shelf.printAll();
    }
}