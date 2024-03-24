package CreationalPatterns.PrototypePattern.SheepPrototypeExample;

 public interface Sheep {
    Sheep clone ();
    String getName();
    void setName(String name);
}

