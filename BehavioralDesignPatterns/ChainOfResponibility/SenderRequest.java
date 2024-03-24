package BehavioralDesignPatterns.ChainOfResponibility;

public class SenderRequest {
    private Priority priority;

    public SenderRequest(Priority priority){
        this.priority = priority;
    }

    public Priority getPriority (){
        return priority;
    }
}

enum Priority {
    Basic , Intermediate, Critical
}