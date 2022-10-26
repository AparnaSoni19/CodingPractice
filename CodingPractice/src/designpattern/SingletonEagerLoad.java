package designpattern;

public class SingletonEagerLoad {
    private static final SingletonEagerLoad instance = new SingletonEagerLoad();
    private SingletonEagerLoad()
    {

    }

    public static SingletonEagerLoad getObject()
    {
        return instance;
    }
}
