package ru.mirea.lab7.Task4;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    @Override
    public double modulus(double real, double imag) {
        return Math.sqrt(real * real + imag * imag);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
