package CreationalPatterns.BuilderPattern.PizzaMenuExample;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}