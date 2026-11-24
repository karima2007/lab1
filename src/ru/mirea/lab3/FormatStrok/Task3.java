package ru.mirea.lab3.FormatStrok;

import java.util.Formatter;

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        Formatter formatter = new Formatter();

        formatter.format("%-25s %15s%n", "Сотрудник", "Зарплата");


        for (int i = 0; i < employees.length; i++) {
            // %-25s - имя выровнено по левому краю, ширина 25
            // %15.2f - зарплата выровнена по правому краю, 2 знака после запятой
            formatter.format("%-25s %15.2f%n",
                    employees[i].getFullname(), employees[i].getSalary());
        }

        System.out.println(formatter);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Витт Николь Андреевна", 25000.5),
                new Employee("Петров Пётр Петрович", 70000.0),
                new Employee("Васильева Анастасия Сергеевна", 28000.75),
                new Employee("Гребенщиков Дмитрий Олегович", 97000.35)
        };

        Report.generateReport(employees);
    }
}