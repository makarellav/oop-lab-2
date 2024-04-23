package com.example.lab2.task2;

import com.example.lab2.Task;

public class SecondTask implements Task {
    public void solve() {
        var components = new Component[]{
                new Processor("Ryzen 5 5625U", "AMD", 123, 2.3, 16),
                new VideoCard("GeForce RTX 3050 Ti", "Nvidia", 321, "GDDR6", 20),
                new HardDrive("Seagate BarraCuda HDD", "Seagate", 555, 2000, 7200)
        };

        System.out.println();
        for (var component : components) {
            System.out.println("-".repeat(50));
            System.out.println(STR."Компонент: \{component.getName()}");
            System.out.println(STR."Виробник: \{component.getManufacturer()}");
            System.out.println(STR."Серійний номер: \{component.getSerialNumber()}");
        }
    }

    @Override
    public String describe() {
        return "Описати компоненти";
    }
}
