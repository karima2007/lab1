package ru.mirea.lab1;
public class Task3 {
    public static void main(String[] args) {
        int[] numi = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < numi.length; i++){
            sum = sum + numi[i];
        }
        double otv = (double) sum / numi.length;

        System.out.println("сумма эл:"+sum);
        System.out.println("ср ариф:"+otv);

    }
}