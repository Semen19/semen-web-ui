package org.example;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Wrong triangle by given arguments");
        }
        if(a + b <= c || c + b <= a || c + a <= b) {
            throw new IllegalArgumentException("Wrong triangle by given arguments");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getTriangleArea() {
        int p = (b + c + a) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}