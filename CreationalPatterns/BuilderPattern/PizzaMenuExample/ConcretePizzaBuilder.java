package CreationalPatterns.BuilderPattern.PizzaMenuExample;

public class ConcretePizzaBuilder implements PizzaBuilder{
    Pizza pizza = new Pizza();

   public void buildDough() {
        pizza.setDough(" Pan Baked ");
    }

    public void buildSauce () {
       pizza.setSauce(" Mild ");
    }

    public void buildTopping () {
       pizza.setTopping(" Ham and PineApple ");
    }

    public Pizza getPizza (){
        return pizza;
    }
}