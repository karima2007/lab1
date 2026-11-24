package ru.mirea.lab9;


public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int gpa; // Итоговый балл

    public Student(int id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + "', gpa=" + gpa + '}';
    }

    // Это реализация стандартного Comparable (сравниваем по ID)
    @Override
    public int compareTo(Student other) {
        // Возвращает отрицательное число, если наш ID меньше, 0 - если равны, положительное - если больше
        return Integer.compare(this.id, other.id);
    }
}
