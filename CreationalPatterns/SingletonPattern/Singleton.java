package CreationalPatterns.SingletonPattern;

class Singleton {
    private static volatile Singleton instance;

    private Singleton () {
        System.out.println("Hello World 1");
    };

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
            return instance;
    }

    public static void display () {
        System.out.println("Something IS done in");
    }

}
