package ru.mirea.lab1;

public class Task7 {
    public static int fac(int n){
        if (n < 0){
            System.out.println("Ошибка: факториал не определён для отрицательных чисел");
            return -1;
        }
        int res = 1;

        for (int i =1; i<= n; i++){
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        for (int i = 0; i<11; i++)
            System.out.println(i + "! = " + fac(i));


    }
}
