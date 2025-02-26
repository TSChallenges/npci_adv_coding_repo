package threads.executor.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo2 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        MyThread t3 = new MyThread("T3");
        MyThread t4 = new MyThread("T4");
        MyThread t5 = new MyThread("T5");

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//
//        scheduledExecutorService.schedule(t1,5, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(t2,15, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(t3,2, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(t4,2, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(t5,2, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(t1,2,5,TimeUnit.SECONDS);

        scheduledExecutorService.schedule(() -> {
            scheduledExecutorService.shutdown();
        }, 30, TimeUnit.SECONDS);

    }
}
