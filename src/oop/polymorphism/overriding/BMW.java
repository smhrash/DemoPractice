package oop.polymorphism.overriding;

public class BMW extends Car {

    // Annotation: over+ ride

    public void carStart(){
        System.out.println("BMW has start feature");
        System.out.println("I love BMW");
    }


    public void carEngine(String engineName){
        //System.out.println("Car has Engine"+engineName);
        System.out.println("Its up to you what ever code you do inside of the body of this overridden method "+engineName);
    }

    public void carStop(){
        System.out.println("BMW has stop feature");
    }


    public void gps() {
        System.out.println("BMW has GPS");
    }


    public void flyingFeature() {
        System.out.println("BMW has Flying feature");
    }

}
