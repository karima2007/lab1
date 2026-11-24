package ru.mirea.lab3.Obolochka;

public class Task1 {

    public static void main(String[] args) {
        // 1. Создаём объекты класса Double через valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // 2. Преобразуем String к double через parseDouble()
        String str = "5.55";
        double parsed = Double.parseDouble(str);
        System.out.println("parseDouble: " + parsed);

        // 3. Преобразуем объект Double ко всем примитивным типам
        Double obj = Double.valueOf(65.13);
        byte b = obj.byteValue();
        short s = obj.shortValue();
        int i = obj.intValue();
        long l = obj.longValue();
        float f = obj.floatValue();
        double d = obj.doubleValue();

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // 4. Выводим значение объекта Double на консоль
        System.out.println("Объект Double: " + obj);

        // 5. Преобразуем литерал типа double к строке
        String dStr = Double.toString(3.14);
        System.out.println("Строка: " + dStr);
    }
}