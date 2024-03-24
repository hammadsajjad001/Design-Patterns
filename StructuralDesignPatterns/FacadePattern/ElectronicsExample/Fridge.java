
package StructuralDesignPatterns.FacadePattern.ElectronicsExample;

public class Fridge implements ElectronicsDevice {
    public String deviceName () {
        return "Fridge";
    }

    public String modelName () {
        return  "FXD486";
    }

    public int price () {
        return 50000;
    }
}