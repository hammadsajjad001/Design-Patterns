package BehavioralDesignPatterns.ChainOfResponibility;


public interface Handler {
    void handleRequest(SenderRequest request);
    void setNextHandler (Handler handler);
}

class Level1SupportHandler implements Handler{
    Handler nextHandler;

    public void setNextHandler (Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handleRequest (SenderRequest request){
        if(request.getPriority() == Priority.Basic ){
            System.out.println("Level 1 Support Handler handled the request");
        } else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}

class Level2SupportHandler implements Handler{
    Handler nextHandler;

    public void setNextHandler (Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handleRequest (SenderRequest request){
        if(request.getPriority() == Priority.Intermediate ){
            System.out.println("Level 2 Support Handler handled the request");
        } else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}

class Level3SupportHandler implements Handler{
    Handler nextHandler;

    public void setNextHandler (Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handleRequest (SenderRequest request){
        if(request.getPriority() == Priority.Critical ){
            System.out.println("Level 3 Support Handler handled the request");
        } else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}