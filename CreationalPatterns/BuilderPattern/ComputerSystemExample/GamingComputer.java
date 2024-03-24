package CreationalPatterns.BuilderPattern.ComputerSystemExample;

class GamingComputer implements ComputerBuilder {
    private final Computer computer = new Computer();

    public void buildCpu(){
        computer.setCpu("Gaming CPU");
    }

    public void buildRam (){
        computer.setRam("16GB DDR4");
    }

    public void buildStorage () {
        computer.setStorage("1TB SSD");
    }

    public Computer getResult () {
        return  computer;
    }
}
