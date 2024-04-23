package com.example.lab2.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Polygon {
    private final ArrayList<Vertex> vertices = new ArrayList<>();
    private final int verticesCount;

    public Polygon(Vertex... vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 vertices.");
        }

        Collections.addAll(this.vertices, vertices);
        verticesCount = vertices.length;
    }

    public double perimeter() {
        var perimeter = 0.0;

        for (int i = 0; i < vertices.size(); i++) {
            var nextIndex = (i + 1) % vertices.size();

            var start = vertices.get(i);
            var end = vertices.get(nextIndex);

            perimeter += start.distance(end);
        }

        return perimeter;
    }

    public double area() {
        var acc = 0.0;

        for (int i = 0; i < vertices.size(); i++) {
            var nextIndex = (i + 1) % vertices.size();

            var a = vertices.get(i);
            var b = vertices.get(nextIndex);

            acc += a.getX() * b.getY() - a.getY() * b.getX();
        }

        return Math.abs(acc) / 2;
    }

    public boolean isPointOnBoundary(Vertex point) {
        for (var i = 0; i < vertices.size(); i++) {
            var nextIndex = (i + 1) % vertices.size();

            var start = vertices.get(i);
            var end = vertices.get(nextIndex);

            var d = (end.getX() - start.getX()) * (point.getY() - start.getY()) - (point.getX() - start.getX()) * (end.getY() - start.getY());

            if (d == 0) {
                if (Math.min(start.getX(), end.getX()) <= point.getX() && point.getX() <= Math.max(start.getX(), end.getX()) &&
                        Math.min(start.getY(), end.getY()) <= point.getY() && point.getY() <= Math.max(start.getY(), end.getY())) {
                    return true;
                }
            }
        }

        return false;
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        sb.append(STR."[\{System.lineSeparator()}");

        for (var vertex : vertices) {
            sb.append(STR."\t\{vertex},\{System.lineSeparator()}");
        }

        sb.append("]");

        return sb.toString();
    }
}
