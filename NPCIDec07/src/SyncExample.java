import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter {
    private int count = 0;

    public  void increment() {
        count++;
//        System.out.println(count);
//        try {
//            Thread.sleep(1);
//        }catch (Exception ex){ex.printStackTrace();}
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        System.out.println(t1.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();


//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
////        Runnable task = () -> System.out.println("Task executed by: " + Thread.currentThread().getName());
//
//        executor.execute(t1);
//        executor.execute(t2);
//        executor.execute(t3);
//        executor.execute(t4);
//        executor.execute(t5);

        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());
        System.out.println(t5.getState());
//        executor.shutdown();

        System.out.println("Final Count: " + counter.getCount()); // Output: 2000
    }

}