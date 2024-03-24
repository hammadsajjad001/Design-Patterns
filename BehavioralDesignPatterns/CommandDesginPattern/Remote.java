package BehavioralDesignPatterns.CommandDesginPattern;


public class Remote {
    TubeLightCommand command;

    Remote(TubeLightCommand command){
        this.command = command;
    }

    public void setCommand(TubeLightCommand command){
        this.command = command;
    }

    public void pressButton (){
     command.execute();
    }
}