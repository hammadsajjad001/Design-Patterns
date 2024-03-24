package CreationalPatterns.BuilderPattern.ComputerSystemExample;

public class MainBuilder {
    public static void main (String [] args) {
        GamingComputer gamingComputer = new GamingComputer();
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingComputer);
       Computer gameComputer = gamingComputer.getResult();

       gameComputer.display();

    }
}