package org.example;

public class Car {

    Engine engine;

    public Car(){
        System.out.println("Car constructor");
    }

    public void drive() {
        int start = engine.start();
        if(start>=1){
            System.out.println("The car is running");
        }else{
            System.out.println("The car is not running");
        }
    }

    public void setEngine(PetrolEngine engine) {
        this.engine = engine;
    }
}
