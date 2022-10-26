package thread.racecondition;
//here expected value is 1M but we were getting diffrent value because of different read and write
// so we synchronized the bloch to read and write L
public class RaceConditionWithMultipleThread {
    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };
            Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
//        for(int i = 0; i < threads.length; i++)
//        {
//            threads[i].join();
//        }
        System.out.println("Value is "+longWrapper.getValue());
        }

    }

