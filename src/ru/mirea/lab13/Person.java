package ru.mirea.lab13;
//Task2
public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    // Метод возвращает Фамилию И.О. (оптимизировано через StringBuilder)
    public String getShortName() {
        StringBuilder sb = new StringBuilder();
        sb.append(surname);

        // Добавляем имя, если оно есть
        if (name != null && !name.isEmpty()) {
            sb.append(" ").append(name.charAt(0)).append(".");
        }
        // Добавляем отчество, если оно есть
        if (patronymic != null && !patronymic.isEmpty()) {
            sb.append(patronymic.charAt(0)).append(".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Тест 1 (полные данные): " + new Person("Иванов", "Иван", "Иванович").getShortName());
        System.out.println("Тест 2 (без отчества):   " + new Person("Петров", "Петр", null).getShortName());
        System.out.println("Тест 3 (только фамилия): " + new Person("Миронов", "", "").getShortName());
    }
}