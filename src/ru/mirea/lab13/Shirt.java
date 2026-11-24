package ru.mirea.lab13;
//Task4
public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    // Конструктор разбирает строку формата "S001,Black Polo Shirt,Black,XL"
    public Shirt(String csvLine) {
        String[] parts = csvLine.split(",");
        this.id = parts[0];
        this.description = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "Артикул: " + id + " | Описание: " + description +
                " | Цвет: " + color + " | Размер: " + size;
    }

    public static void main(String[] args) {
        String[] shirts = new String[] {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        // Преобразуем строковый массив в массив объектов
        Shirt[] shirtObjects = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
        }

        System.out.println("Список рубашек:");
        for (Shirt s : shirtObjects) {
            System.out.println(s.toString());
        }
    }
}