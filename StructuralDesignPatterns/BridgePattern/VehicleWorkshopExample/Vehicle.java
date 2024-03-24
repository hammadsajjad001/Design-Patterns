package StructuralDesignPatterns.BridgePattern.VehicleWorkshopExample;

abstract class Vehicle {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    protected Vehicle (WorkShop workShop1, WorkShop workShop2){
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    public abstract void manufacture();
}

class Car extends Vehicle {
    public Car (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }

    @Override
    public void manufacture(){
        System.out.println("Car ");
        workShop1.work();
        workShop2.work();
    }
}

class Bike extends Vehicle {
    public Bike (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }

    @Override
    public void manufacture(){
        System.out.println("Bike ");
        workShop1.work();
        workShop2.work();
    }
}