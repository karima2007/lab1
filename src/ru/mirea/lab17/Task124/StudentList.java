package ru.mirea.lab17.Task124;
public interface StudentList {
    void add(Student student);

    boolean removeById(int idNumber);

    void displayAll();

    void clear();

    boolean isEmpty();
}
