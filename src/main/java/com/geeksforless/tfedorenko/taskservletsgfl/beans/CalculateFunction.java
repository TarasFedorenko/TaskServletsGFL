package com.geeksforless.tfedorenko.taskservletsgfl.beans;


public class CalculateFunction {
    private double x;

    public CalculateFunction(double x) {
        this.x = x;
    }

    public double calculateBX() {
        double y;
        double b = 1.5;
        double bx = x * b;
        if (bx <= 0.45) {
            y = bx - Math.tan(bx);
        } else {
            y = bx + Math.log(bx);
        }
        return y;
    }
    public double getX() {
        return x;
    }
}