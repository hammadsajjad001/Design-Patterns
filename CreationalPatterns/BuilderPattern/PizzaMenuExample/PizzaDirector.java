package CreationalPatterns.BuilderPattern.PizzaMenuExample;

public class PizzaDirector {
    Pizza makePizza (PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
        return builder.getPizza();
    }
}