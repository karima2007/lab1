package ru.mirea.lab2.Task9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Создаём колоду
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(ranks[j] + " " + suits[i]);
            }
        }

        // Перемешиваем
        Random rand = new Random();
        for (int i = 0; i < deck.size(); i++) {
            int j = rand.nextInt(deck.size());
            String temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }

        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n * 5 > deck.size()) {
            System.out.println("Слишком много игроков!");
            return;
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("  " + deck.get(index));
                index++;
            }
            System.out.println(); // пустая строка между игроками
        }

        sc.close();
    }
}