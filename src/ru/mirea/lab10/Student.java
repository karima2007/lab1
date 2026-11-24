package ru.mirea.lab10;


public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private int gpa; // Средний балл (понадобится для сортировки во 2 задании)

    // Конструктор
    public Student(String name, String surname, String specialty, int course, String group, int gpa) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public int getGpa() { return gpa; }
    public void setGpa(int gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return surname + " " + name + " | Спец: " + specialty + " | Курс: " + course + " | Группа: " + group + " | Балл: " + gpa;
    }
}