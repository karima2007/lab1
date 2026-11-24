package ru.mirea.lab1;

public class Task5 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);   //println всегда ставит перевод строки в конце
        }
        if (args.length == 0) {
            System.out.println("Аргументы не были переданы");
        }
    }
}







