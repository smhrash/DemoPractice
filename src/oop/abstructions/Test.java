package oop.abstructions;

public class Test {

    public static void main(String[] args) {


        GeneralMotors gm= new GeneralMotors();
        gm.accelerateCar();
        gm.breakCar();
        gm.autoGear();
        gm.blindSpot();

        Tesla tesla= new Tesla();
        tesla.largeDisplay();

    }
}
