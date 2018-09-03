package imp1;

public class Singleton {

    private static Singleton uniqueInstance;


    private Singleton() {
    }


    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}