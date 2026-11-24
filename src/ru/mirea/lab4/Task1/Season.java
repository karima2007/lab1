package ru.mirea.lab4.Task1;



public enum Season {
    WINTER(-10.0),
    SPRING(10.0),
    SUMMER(25.0),
    AUTUMN(5.0);

    // 3) переменная для средней температуры
    private final double averageTemperature;

    // 4) конструктор, принимающий среднюю температуру
    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // геттер для температуры
    public double getAverageTemperature() {
        return averageTemperature;
    }

    // 5) метод getDescription
    // для ЛЕТА — "Теплое время года", для остальных — "Холодное время года"
    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}