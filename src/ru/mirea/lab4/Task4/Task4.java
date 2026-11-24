package ru.mirea.lab4.Task4;

public class Task4 {
    public static void main(String[] args) {
        Processor proc = new Processor("Intel Core i7", 3.5);
        Memory mem = new Memory(16, "DDR4");
        Monitor mon = new Monitor(24.0, "1920x1080");

        Computer pc = new Computer(Brand.HUAWEI, proc, mem, mon);
        pc.printInfo();
    }

}
