package BehavioralDesignPatterns.CommandDesginPattern;

public class MainTubeLight {
    public static void main (String [] args){
        TubeLight tubeLight = new TubeLight();
        TubeLightOnCommand tubeLightOnCommand = new TubeLightOnCommand(tubeLight);
        Remote remote = new Remote(tubeLightOnCommand);
        remote.pressButton();

        TubeLightOffCommand tubeLightOffCommand = new TubeLightOffCommand(tubeLight);
         remote.setCommand(tubeLightOffCommand);
        remote.pressButton();
    }
}