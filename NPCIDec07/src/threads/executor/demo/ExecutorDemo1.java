package threads.executor.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        MyThread t3 = new MyThread("T3");
        MyThread t4 = new MyThread("T4");
        MyThread t5 = new MyThread("T5");
        MyThread t6 = new MyThread("T6");
        MyThread t7 = new MyThread("T7");
        MyThread t8 = new MyThread("T8");
        MyThread t9 = new MyThread("T9");
        MyThread t10 = new MyThread("T10");

        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);
        executorService.execute(t6);
        executorService.execute(t7);
        executorService.execute(t8);
        executorService.execute(t9);
        executorService.execute(t10);

        executorService.shutdown();

    }
}

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(getName() + " Thread executed.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
