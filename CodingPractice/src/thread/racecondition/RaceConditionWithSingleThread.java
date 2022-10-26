package thread.racecondition;

public class RaceConditionWithSingleThread {
    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };
            Thread t = new Thread(runnable);
            t.start();
            t.join();
        System.out.println("Value is "+longWrapper.getValue());
        }

    }

