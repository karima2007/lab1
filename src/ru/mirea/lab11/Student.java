package ru.mirea.lab11;

import java.text.DateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthDate; // Поле для хранения даты рождения

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    // Метод для получения даты рождения в нужном формате (по заданию)
    public String getFormattedBirthDate(int formatStyle) {
        // formatStyle: DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.FULL
        DateFormat df = DateFormat.getDateInstance(formatStyle);
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + surname + " " + name + " | Дата рождения: " + birthDate;
    }
}