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
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1500;
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setColor("White");
//        car.doorCount = 4;
//        car.setMileage(7.5);;
//        car.running = true;
//
//        double carTravelDistance = car.accelerate(100, 2);
//
//
//
//
//       //engine.expiryDate = LocalDateTime.now().minusYears(10);
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "Fiat";
//        engine1.capacity = 1900;
//
//        Car car2 = new Car(engine1);
//        car2.setName("Fiat");
//
//        //test//
        //Example of static variables
        Vehicle vehicle1 = new Vehicle();
//        vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
//        vehicle2.vehicleCount = 2;


//      Vehicle.vehicleCount = 3;

        //System.out.println("Value from vehicle 1: "+ vehicle1.vehicleCount);
        //System.out.println("Value from vehicle 2: "+ vehicle2.vehicleCount);
        System.out.println("Value from vehicle Class: "+ Vehicle.vehicleCount);


    }
}
