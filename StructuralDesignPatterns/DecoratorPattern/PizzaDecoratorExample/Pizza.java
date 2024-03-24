package StructuralDesignPatterns.DecoratorPattern.PizzaDecoratorExample;

public abstract class Pizza {
    String description = "Unknown Pizza";
    public String getDescription (){
        return description;
    }

    public abstract int getCost();
}

class PeppyPaneer extends Pizza {

    public PeppyPaneer() {
        description = "Peppy Paneer ";
    }

    @Override
    public int getCost () {
        return 100;
    }
}

class FarmHouse extends Pizza {

    public FarmHouse() {
        description = "FarmHouse ";
    }

    @Override
    public int getCost () {
        return 200;
    }
}

class Margherita extends Pizza {

    public Margherita() {
        description = "Margherita ";
    }

    @Override
    public int getCost () {
        return 300;
    }
}


class ChickenFiesta extends Pizza {

    public ChickenFiesta() {
        description = "Chicken Fiesta ";
    }

    @Override
    public int getCost () {
        return 400;
    }
}
