package ru.mirea.lab20;

import java.io.Serializable;


public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T var1;
    private V var2;
    private K var3;

    public GenericClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() { return var1; }
    public V getVar2() { return var2; }
    public K getVar3() { return var3; }

    public void printClassNames() {
        System.out.println("Тип T: " + var1.getClass().getName());
        System.out.println("Тип V: " + var2.getClass().getName());
        System.out.println("Тип K: " + var3.getClass().getName());
    }

    public static void main(String[] args) {
        // Запускаем программу прямо из этого файла
        GenericClass<String, Dog, Integer> obj = new GenericClass<>("Hello", new Dog("Rex"), 100);

        System.out.println("Var1: " + obj.getVar1());
        System.out.println("Var2: " + obj.getVar2());
        System.out.println("Var3: " + obj.getVar3());
        System.out.println("--- Имена классов ---");
        obj.printClassNames();
    }
}