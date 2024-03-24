package BehavioralDesignPatterns.CommandDesginPattern;

public interface TubeLightCommand {
    void execute();
}

class TubeLightOnCommand implements TubeLightCommand {
    TubeLight tubeLight;

    public TubeLightOnCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }

   public void execute(){
        tubeLight.switchON();
    }
}

class TubeLightOffCommand implements TubeLightCommand {
    TubeLight tubeLight;

    public TubeLightOffCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }

    public void execute(){
        tubeLight.switchOFF();
    }
}
