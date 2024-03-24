package StructuralDesignPatterns.FacadePattern.ElectronicsExample;

public class ElectronicsShop {
    ElectronicsDevice fridge;
    ElectronicsDevice tv;
    ElectronicsDevice washingMachine;

    public ElectronicsShop(){
        fridge = new Fridge();
        tv = new TV();
        washingMachine = new WashingMachine();
    }

    public void sellFridge()
    {
        System.out.println("Details of " + fridge.deviceName() + " :");
        System.out.println("Model No: " + fridge.modelName());
        System.out.println("Price: Rs. " + fridge.price());
    }
    public void sellWashingMachine() {
        System.out.println("Details of " + washingMachine.deviceName() + " :");
        System.out.println("Model No: " + washingMachine.modelName());
        System.out.println("Price: Rs. " + washingMachine.price());
    }
    public void sellTV()
    {
        System.out.println("Details of " + tv.deviceName() + " :");
        System.out.println("Model No: " + tv.modelName());
        System.out.println("Price: Rs. " + tv.price());
    }
}