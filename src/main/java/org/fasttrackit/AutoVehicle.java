package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    Engine engine;
    boolean running;


    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle() {

//        this.engine = new Engine();
        this(new Engine()) ;
    }
}
