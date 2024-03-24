package CreationalPatterns.BuilderPattern.ComputerSystemExample;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam ();
    void buildStorage();
    Computer getResult();
}

