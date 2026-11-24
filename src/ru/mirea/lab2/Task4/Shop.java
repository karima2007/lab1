package ru.mirea.lab2.Task4;
import java.util.ArrayList;
public class Shop {

    private ArrayList<Comp> computers = new ArrayList<>();

    public void addComputer(Comp c) {
        computers.add(c);
        System.out.println("комп добавлен: " + c);
    }

    public void removeComputer(String name) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equals(name)) {
                System.out.println("комп удалён: " + computers.get(i));
                computers.remove(i);
                return;
            }
        }
        System.out.println("комп с ником " + name + " не найден.");
    }

    public void findComputer(String name) {
        for (Comp c : computers) {
            if (c.getName().equals(name)) {
                System.out.println("найден: " + c);
                return;
            }
        }
        System.out.println("компьютер с именем " + name + " не найден.");
    }
}