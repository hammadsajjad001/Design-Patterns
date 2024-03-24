package StructuralDesignPatterns.BridgePattern.VehicleWorkshopExample;

public class VehicleMain {
    public static void main (String [] args) {
        Vehicle car1 = new Car(new Produce(), new Assemble());
        car1.manufacture();
        Vehicle bike1 = new Bike(new Produce(), new Assemble());
        bike1.manufacture();
    }
}
