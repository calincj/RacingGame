package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;

    public double accelerate(double speed, double duractionInHours) {

        System.out.println(name + " accelerated with " + speed + " 100 km/h for " + duractionInHours + " hours. ");
        double travelDistance = speed * duractionInHours;

        System.out.println("Travel distance");

        return travelDistance;
    }

}
