package com.example.lab2.task2;

public class Component {
    private final String name;
    private final String manufacturer;
    private final int serialNumber;

    public Component(String name, String manufacturer, int serialNumber) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Component name cannot be empty");
        }

        if (manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer name cannot be empty");
        }

        if (serialNumber <= 0) {
            throw new IllegalArgumentException("Serial number should be a positive integer");
        }

        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
