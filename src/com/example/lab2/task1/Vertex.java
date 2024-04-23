package com.example.lab2.task1;

import static java.lang.StringTemplate.STR;

public class Vertex {

    private final double x;
    private final double y;

    public static Vertex withX(double x) {
        return new Vertex(x, 0);
    }

    public static Vertex withY(double y) {
        return new Vertex(0, y);
    }

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertex() {
        var min = -100;
        var max = 100;

        x = min + (max - min) * Math.random();
        y = min + (max - min) * Math.random();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Vertex other) {
        return Math.hypot((other.getX() - getX()), (other.getY() - getY()));
    }

    @Override
    public String toString() {
        return STR."{ x: \{x}, y: \{y} }";
    }
}
