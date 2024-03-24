package StructuralDesignPatterns.FacadePattern.ElectronicsExample;

public class WashingMachine implements ElectronicsDevice {
    public String deviceName () {
        return "Samsung Washing Machine";
    }

    public String modelName () {
        return  "DEF456";
    }

    public int price () {
        return 24000;
    }
}