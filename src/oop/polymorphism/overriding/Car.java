package oop.polymorphism.overriding;

public class Car implements NewCar{

    public void carStart(){
        System.out.println("Car has start feature");
    }

    public void carStop(){
        System.out.println("Car has stop feature");
    }

    public void carEngine(String engineName){
        System.out.println("Car has Engine"+engineName);
    }

    public void carWheel(){
        System.out.println("Car has Wheel");
    }

    @Override
    public void gps() {

    }
}
