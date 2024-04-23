package com.example.lab2.task1;

import com.example.lab2.Task;

public class FirstTask implements Task {
    public void solve() {
        var v1 = new Vertex(4, 10);
        var v2 = new Vertex(12, 8);
        var v3 = new Vertex(10, 3);
        var v4 = new Vertex(2, 2);
        var v5 = new Vertex(7, 5);

        var p = new Polygon(v1, v2, v3, v4, v5);

        System.out.println();
        System.out.println("Многокутник має наступні вершини:");
        System.out.println(p);
        System.out.println(STR."Кількість вершин: \{p.getVerticesCount()}");
        System.out.println(STR."Периметер: \{p.perimeter()}");
        System.out.println(STR."Площа: \{p.area()}");
        System.out.println(STR."Чи належить точка \{v3} ребру: \{p.isPointOnBoundary(v3) ? "так" : "ні"}");
    }

    @Override
    public String describe() {
        return "Провести дії з многокутником";
    }
}
