package ru.mirea.lab2.Task4;
import java.util.Scanner;
public class TestShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();


        System.out.print("Сколько компьютеров добавить? ");
        int n = sc.nextInt();
        sc.nextLine(); // очистка буфера

        for (int i = 0; i < n; i++) {
            System.out.print("введите название компьютера: ");
            String name = sc.nextLine();
            System.out.print("введите цену: ");
            double price = sc.nextDouble();
            sc.nextLine();

            shop.addComputer(new Comp(name, price));
        }

        // поиск
        System.out.print("введите имя для поиска: ");
        String findName = sc.nextLine();
        shop.findComputer(findName);

        // del
        System.out.print("введите имя для удаления: ");
        String delName = sc.nextLine();
        shop.removeComputer(delName);

        sc.close();
    }
}