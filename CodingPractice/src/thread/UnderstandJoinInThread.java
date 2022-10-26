package thread;

public class UnderstandJoinInThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable =()-> System.out.println("Mythread name is "+Thread.currentThread().getName());
                Thread[] thread = new Thread[10];
                for(int i =0;i<thread.length;i++) {
                    thread[i] = new Thread(runnable);
                    thread[i].start();

                }
        for(int i =0;i<thread.length;i++) {
            thread[i].join();
        }
        System.out.println("Joining "+Thread.currentThread().getName());
    }
}
