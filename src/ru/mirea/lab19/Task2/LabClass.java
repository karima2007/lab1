package ru.mirea.lab19.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabClass {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortByAverageGrade() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    public Student findByName(String name) throws EmptyStringException, StudentNotFoundException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name.trim())) {
                return s;
            }
        }
        throw new StudentNotFoundException("Студент не найден: " + name);
    }

    public List<Student> getStudents() {
        return students;
    }
}