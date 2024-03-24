package CreationalPatterns.BuilderPattern.ComputerSystemExample;

public class ComputerDirector {
    public void construct (ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}