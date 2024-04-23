package com.example.lab2.task2;

public class Processor extends Component {
    private final double speed;
    private final double cacheMemoryMB;

    public Processor(String name, String manufacturer, int serialNumber, double speed, double cacheMemoryMB) {
        super(name, manufacturer, serialNumber);

        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be a positive double");
        }

        if (cacheMemoryMB <= 0) {
            throw new IllegalArgumentException("Cache memory must be a positive double");
        }

        this.speed = speed;
        this.cacheMemoryMB = cacheMemoryMB;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCacheMemoryMB() {
        return cacheMemoryMB;
    }

    public void performOperation() {
        System.out.println("Computating a task...");
    }

    public void manageMemory() {
        System.out.println("Clearing cache...");
    }
}
