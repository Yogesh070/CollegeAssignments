public class Singleton {
    
    private static final Singleton instance = new Singleton();

    // private constructor to avoid client applications using the constructor
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
