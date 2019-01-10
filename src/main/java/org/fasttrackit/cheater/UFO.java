package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Accelerating as UFO");
        System.out.println(getName() + " accelerated with " + speed + " 100 km/h for " + durationInHours + " hours. ");

        double travelDistance = 2 * speed * durationInHours;

        System.out.println("Travel distance" + travelDistance);

        return travelDistance;
    }

    public void concealCheating() {

        System.out.println("I`m not cheating!");
    }


}
