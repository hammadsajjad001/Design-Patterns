package StructuralDesignPatterns.DecoratorPattern.PizzaDecoratorExample;

public class PizzaStore {
    public static void main (String [] args) {
        Pizza pizza = new ChickenFiesta();
        System.out.println(pizza.getDescription() + ":" + pizza.getCost());

        Pizza pizza2 = new FarmHouse();
        System.out.println(pizza2.getDescription() + ":" + pizza2.getCost());

        Pizza barbeque = new Barbeque(pizza);
        System.out.println(barbeque.getDescription() + ":" + barbeque.getCost());

        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription() + ":" + pizza2.getCost());
    }
}