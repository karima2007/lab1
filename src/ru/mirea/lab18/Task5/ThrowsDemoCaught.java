package ru.mirea.lab18.Task5;

public class ThrowsDemoCaught {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}