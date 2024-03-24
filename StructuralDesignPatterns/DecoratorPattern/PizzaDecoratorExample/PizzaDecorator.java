package StructuralDesignPatterns.DecoratorPattern.PizzaDecoratorExample;

abstract class PizzaDecorator extends Pizza {

    public abstract String getDescription ();
}

class FreshTomato extends PizzaDecorator{
    Pizza pizza;

    public FreshTomato (Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription () {
        return pizza.getDescription() + "Fresh Tomato";
    }

    public  int getCost(){
        return pizza.getCost() + 30;
    }
}

class Barbeque extends PizzaDecorator{
    Pizza pizza;

    public Barbeque (Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription () {
        return pizza.getDescription() + "Barbeque";
    }

    public  int getCost(){
        return pizza.getCost() + 70;
    }
}

class Cheese extends PizzaDecorator{
    Pizza pizza;

    public Cheese (Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription () {
        return pizza.getDescription() + "Cheese";
    }

    public  int getCost(){
        return pizza.getCost() + 50;
    }
}