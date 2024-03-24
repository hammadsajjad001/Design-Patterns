package BehavioralDesignPatterns.ChainOfResponibility;

public class MainHandle {
    public static void main (String [] args) {
        Handler handler1 = new Level1SupportHandler();
        Handler handler2 = new Level2SupportHandler();
        Handler handler3 = new Level3SupportHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);


        SenderRequest senderRequest1 = new SenderRequest(Priority.Basic);
        SenderRequest senderRequest2 = new SenderRequest(Priority.Intermediate);
        SenderRequest senderRequest3 = new SenderRequest(Priority.Critical);

        handler1.handleRequest(senderRequest1);
        handler1.handleRequest(senderRequest2);
        handler1.handleRequest(senderRequest3);

    }
}