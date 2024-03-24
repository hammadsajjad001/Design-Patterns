package CreationalPatterns.BuilderPattern.PizzaMenuExample;

public class MainPizza {
    public static void main (String [] args) {
        PizzaBuilder builtPizza = new ConcretePizzaBuilder();
        PizzaDirector director = new PizzaDirector();
        Pizza italianPizza = director.makePizza(builtPizza);
        System.out.println("Italian Pizza :" + italianPizza);

    }
}