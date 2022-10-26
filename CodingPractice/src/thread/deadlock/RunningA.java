package thread.deadlock;

public class RunningA {
    public static void main(String[] args) throws InterruptedException {
        PossibleDeadlock possibleDeadlock = new PossibleDeadlock();
        Runnable runnable1 = ()-> possibleDeadlock.a();
        Runnable runnable2 = ()-> possibleDeadlock.b();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
