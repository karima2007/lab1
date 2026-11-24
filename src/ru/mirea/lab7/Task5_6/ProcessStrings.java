package ru.mirea.lab7.Task5_6;

public class ProcessStrings implements StringWork {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String oddPositions(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i = i + 2) {
            result = result + s.charAt(i);
        }
        return result;
    }

    @Override
    public String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}