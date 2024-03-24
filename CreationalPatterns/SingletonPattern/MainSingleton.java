package CreationalPatterns.SingletonPattern;

public class MainSingleton {
    public static void main (String [] args){
        Singleton instance = Singleton.getInstance();
        Singleton.display();

        Singleton instance2 = Singleton.getInstance();
        Singleton.display();
    }
}