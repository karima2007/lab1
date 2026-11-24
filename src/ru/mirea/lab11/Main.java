package ru.mirea.lab11;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        task1();

        System.out.println("\nЗАДАНИЕ 2");
        task2();

        System.out.println("\nЗАДАНИЕ 3");
        task3();

        System.out.println("\nЗАДАНИЕ 4");
        task4();

        System.out.println("\nЗАДАНИЕ 5");
        task5();
    }

    //ЗАДАНИЕ 1
    // Вывести фамилию, дату получения и сдачи задания (используя класс Date)
    public static void task1() {
        String developerSurname = "Кадырова";
        Date receiveDate = new Date(); // Дата получения (сейчас)

        // Имитируем дату сдачи (н, через 3 дня)
        // System.currentTimeMillis() дает миллисекунды. 3 дня = 3 * 24 * 60 * 60 * 1000
        long threeDaysInMillis = 3L * 24 * 60 * 60 * 1000;
        Date submitDate = new Date(System.currentTimeMillis() + threeDaysInMillis);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + developerSurname);
        System.out.println("Дата получения: " + sdf.format(receiveDate));
        System.out.println("Дата сдачи: " + sdf.format(submitDate));
    }

    //ЗАДАНИЕ 2
    // Сравнить текущую дату и дату, введенную пользователем
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате (дд.мм.гггг): ");
        String userInput = scanner.nextLine();

        try {
            Date userDate = sdf.parse(userInput); // Превращаем строку в дату
            Date currentDate = new Date();        // Текущая дата

            // Чтобы сравнить только даты (без учета времени), обнулим время
            Calendar calUser = Calendar.getInstance();
            calUser.setTime(userDate);
            calUser.set(Calendar.HOUR_OF_DAY, 0);
            calUser.set(Calendar.MINUTE, 0);
            calUser.set(Calendar.SECOND, 0);
            userDate = calUser.getTime();

            Calendar calCurrent = Calendar.getInstance();
            calCurrent.setTime(currentDate);
            calCurrent.set(Calendar.HOUR_OF_DAY, 0);
            calCurrent.set(Calendar.MINUTE, 0);
            calCurrent.set(Calendar.SECOND, 0);
            currentDate = calCurrent.getTime();

            // Сравниваем
            if (userDate.compareTo(currentDate) < 0) {
                System.out.println("Введенная дата находится в прошлом.");
            } else if (userDate.compareTo(currentDate) > 0) {
                System.out.println("Введенная дата находится в будущем.");
            } else {
                System.out.println("Введенная дата равна текущей дате.");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: вы ввели дату в неверном формате!");
        }
    }

    //ЗАДАНИЕ 3
    // Демонстрация работы класса Student (сам класс в другом файле)
    public static void task3() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.MAY, 15); // Устанавливаем дату рождения (год, месяц, день)
        Date birthDate = cal.getTime();

        Student student = new Student("Валерия", "Пак", birthDate);
        System.out.println(student.toString()); // Обычный вывод

        // Вывод в разных форматах (Short, Medium, Full)
        System.out.println("Короткий формат: " + student.getFormattedBirthDate(java.text.DateFormat.SHORT));
        System.out.println("Средний формат:  " + student.getFormattedBirthDate(java.text.DateFormat.MEDIUM));
        System.out.println("Полный формат:   " + student.getFormattedBirthDate(java.text.DateFormat.FULL));
    }

    //ЗАДАНИЕ 4
    // Создать объекты Date и Calendar по введенным данным
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Год, Месяц, Число (через пробел):");
        int year = scanner.nextInt();
        int month = scanner.nextInt(); // месяцы с 0!
        int day = scanner.nextInt();

        System.out.println("Введите Часы и Минуты (через пробел):");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // 1. Создаем объект Calendar
        Calendar cal = Calendar.getInstance();
        // Месяц в Calendar считается с 0 (Январь = 0), поэтому вычитаем 1
        cal.set(year, month - 1, day, hour, minute, 0);
        System.out.println("Создан Calendar: " + cal.getTime());

        // 2. Создаем объект Date из этого Calendar
        Date date = cal.getTime();
        System.out.println("Создан Date:     " + date);
    }

    //ЗАДАНИЕ 5
    // Сравн производит ArrayList и LinkedList
    public static void task5() {
        int count = 50000;

        //ТЕСТ ARRAYLIST
        long start = System.currentTimeMillis();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(0, i); // Вставка в начало
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList (вставка в начало " + count + " элементов): " + (end - start) + " мс");

        //ТЕСТ LINKEDLIST
        start = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(0, i); // Вставка в начало
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList (вставка в начало " + count + " элементов): " + (end - start) + " мс");

        // Тест поиска (поиск по значению)
        start = System.currentTimeMillis();
        arrayList.contains(count - 1);
        end = System.currentTimeMillis();
        System.out.println("ArrayList (поиск элемента): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        linkedList.contains(count - 1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList (поиск элемента): " + (end - start) + " мс");
    }
}