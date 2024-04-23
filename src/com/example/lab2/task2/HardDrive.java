package com.example.lab2.task2;

public class HardDrive extends Component {
    private final double capacityGB;
    private final int spinSpeed;

    public HardDrive(String name, String manufacturer, int serialNumber, double capacityGB, int spinSpeed) {
        super(name, manufacturer, serialNumber);

        if (capacityGB <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive double");
        }

        if (spinSpeed <= 0) {
            throw new IllegalArgumentException("Spin speed must be a positive integer");
        }

        this.capacityGB = capacityGB;
        this.spinSpeed = spinSpeed;
    }

    public void storeData() {
        System.out.println("Storing data...");
    }

    public void retrieveData() {
        System.out.println("Getting data...");
    }
}
