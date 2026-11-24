package ru.mirea.lab20;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    @SuppressWarnings("unchecked")
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = (T[][]) new Number[rows][cols];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать");
        }
        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double sum = this.data[i][j].doubleValue() + other.data[i][j].doubleValue();
                result.set(i, j, (T) Double.valueOf(sum));
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix<Double> m1 = new Matrix<>(2, 2);
        m1.set(0, 0, 1.5); m1.set(0, 1, 2.5);
        m1.set(1, 0, 3.5); m1.set(1, 1, 4.5);

        Matrix<Double> m2 = new Matrix<>(2, 2);
        m2.set(0, 0, 1.0); m2.set(0, 1, 1.0);
        m2.set(1, 0, 1.0); m2.set(1, 1, 1.0);

        System.out.println("Матрица 1:");
        m1.print();
        System.out.println("Матрица 2:");
        m2.print();

        Matrix<Double> result = m1.add(m2);
        System.out.println("Результат сложения:");
        result.print();
    }
}