package StructuralDesignPatterns.FacadePattern.ElectronicsExample;

public class TV implements ElectronicsDevice {
    public String deviceName () {
        return "SONY TV";
    }

    public String modelName () {
        return  "JKL466";
    }

    public int price () {
        return 70000;
    }
}