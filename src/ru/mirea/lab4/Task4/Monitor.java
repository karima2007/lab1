package ru.mirea.lab4.Task4;

public class Monitor {
    private double diagonal;
    private String resolution;

    public Monitor(double diagonal, String resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Монитор: " + diagonal + "\" " + resolution;
    }

}
