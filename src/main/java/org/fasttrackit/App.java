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
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTravelDistance = car.accelerate(100, 2);




       //engine.expiryDate = LocalDateTime.now().minusYears(10);

        Engine engine1 = new Engine();
        engine1.manufacturer = "Fiat";
        engine1.capacity = 1900;

        Car car2 = new Car(engine1);
        car.name = "Fiat";

        //test//


    }
}
