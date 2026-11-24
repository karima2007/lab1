package ru.mirea.lab7.Task7_8;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                printable[i].print();
            }
        }
    }
}
