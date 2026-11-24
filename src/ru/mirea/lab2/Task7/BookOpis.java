package ru.mirea.lab2.Task7;

public class BookOpis {

    private Book[] books;
    private int count;

    // Конструктор: создаём полку заданного размера
    public BookOpis(int size) {
        books = new Book[size];
        count = 0;
    }

    // Добавить книгу
    public void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
            System.out.println("Книга добавлена: " + b);
        } else {
            System.out.println("Полка заполнена, нельзя добавить: " + b);
        }
    }

    // Самая поздняя книга (самый большой год)
    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

    // Самая ранняя книга (самый маленький год)
    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    // Сортировка книг по году выпуска (по возрастанию) — метод «пузырька»
    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Печать всех книг
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}