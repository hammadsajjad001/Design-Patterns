package StructuralDesignPatterns.BridgePattern.VehicleWorkshopExample;

interface WorkShop {
    public void work();
}

class Produce implements WorkShop {
    @Override
    public void work () {
        System.out.println("Produced ");
    }
}

class Assemble implements WorkShop {
    @Override
    public void work () {
        System.out.println("And ");
        System.out.println("Assemble");
    }
}