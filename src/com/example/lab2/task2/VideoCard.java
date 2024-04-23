package com.example.lab2.task2;

import java.util.Arrays;

public class VideoCard extends Component {
    private final String memoryType;
    private final int raytracingCores;

    public VideoCard(String name, String manufacturer, int serialNumber, String memoryType, int raytracingCores) {
        super(name, manufacturer, serialNumber);

        final String[] permittedMemoryTypes = {"GDDR",
                "GDDR2",
                "GDDR3",
                "GDDR4",
                "GDDR5",
                "GDDR5X",
                "GDDR6",
                "GDDR6X",
                "GDDR6W",
                "GDDR7"};
        var isPermitted = Arrays.stream(permittedMemoryTypes).anyMatch(permitted -> permitted.equalsIgnoreCase(memoryType));

        if (!isPermitted) {
            throw new IllegalArgumentException("The provided memory type is not permitted");
        }

        if (raytracingCores <= 0) {
            throw new IllegalArgumentException("The number of raytracing cores must be a positive integer");
        }

        this.memoryType = memoryType;
        this.raytracingCores = raytracingCores;
    }

    public void renderContent() {
        System.out.println("Rendering content...");
    }

    public void processImage() {
        System.out.println("Processing image...");
    }
}
