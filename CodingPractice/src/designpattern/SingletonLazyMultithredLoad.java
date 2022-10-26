package designpattern;

public class SingletonLazyMultithredLoad {

    private static SingletonLazyMultithredLoad instance;

    private SingletonLazyMultithredLoad() {

    }

    public static synchronized SingletonLazyMultithredLoad getInstance() {
        if (instance == null) {
            instance = new SingletonLazyMultithredLoad();
        }
        return instance;
    }
}
