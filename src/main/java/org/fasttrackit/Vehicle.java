package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;

    private String name;
    private String color;
    private double mileage;

    public Vehicle() {

        vehicleCount++;
    }

    public double accelerate(double speed, double duractionInHours) {

        System.out.println(name + " accelerated with " + speed + " 100 km/h for " + duractionInHours + " hours. ");
        double travelDistance = speed * duractionInHours;

        System.out.println("Travel distance");

        return travelDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
