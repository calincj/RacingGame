package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTravelDistance = car.accelerate(100, 2);




        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        //engine.expiryDate = LocalDateTime.now().minusYears(10);

        car.engine = engine;

        Car car2 = new Car();
        car.name = "BMW";

        //test//


    }
}
