package ru.mirea.lab18.Task6;

public class ThrowsDemoModifiedRunner {
    public static void main(String[] args) {
        ThrowsDemoModified demo = new ThrowsDemoModified();
        demo.printMessage("abc");
        demo.printMessage(null);
    }
}