package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;

interface Component {
    void showPrice();
}

class Leaf implements  Component {
    String name;
    int price;

    public Leaf (String name, int price){
    this.name = name;
    this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println( name + ": " + price);
    }
}

class Composite implements Component {
    String name;
    ArrayList<Component> components;

    public Composite (String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void showPrice() {
        for(Component c : components){
            c.showPrice();
        }
    }
    public void add(Component subComponent) {
        components.add(subComponent);
    }
}

public class ComponentMain {
    public static void main (String [] args) {
        Component hdd = new Leaf("Hdd" ,1000);
        Component ram = new Leaf("Ram", 2000);
        Component processor = new Leaf("Processor",3000);
        Component keyboard = new Leaf("Keyboard", 4000);
        Component mouse = new Leaf("Mouse", 5000);

        Composite computer = new Composite("Computer");
        Composite motherBoard = new Composite("MOtherBoard");
         motherBoard.add(ram);
         motherBoard.add(processor);
        Composite peripherals = new Composite("Peripherals");
        peripherals.add(mouse);
        peripherals.add(keyboard);
        Composite cabinet = new Composite("Cabinet");
        cabinet.add(motherBoard);
        cabinet.add(hdd);

        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();
    }
}

