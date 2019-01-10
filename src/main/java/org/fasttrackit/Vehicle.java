package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;

    private String name;
    private String color;
    private double mileage;

    public Vehicle() {

        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) {

        System.out.println(name + " accelerated with " + speed + " 100 km/h for " + durationInHours + " hours. ");
        double travelDistance = speed * durationInHours;

        System.out.println("Travel distance");

        return travelDistance;
    }

    //example of invoking overloaded methods
    public double accelerate (double speed) {

        return accelerate(speed, 1);

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
