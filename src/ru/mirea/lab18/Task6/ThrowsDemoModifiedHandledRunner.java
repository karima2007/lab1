package ru.mirea.lab18.Task6;

public class ThrowsDemoModifiedHandledRunner {
    public static void main(String[] args) {
        ThrowsDemoModifiedHandled demo = new ThrowsDemoModifiedHandled();
        demo.printMessage("abc");
        demo.printMessage(null);
    }
}