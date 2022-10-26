package thread;

public class MyThreadClass {
    public static void main(String[] args) {
        Runnable runnable =()->
        {
            System.out.println("I am running a thread name " +Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.setName("Soni thread");
        t.start();
    }

}
