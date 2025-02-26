import java.util.ArrayList;
import java.util.List;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        Thread myThread1 = new Thread(() -> {
            System.out.println("Hi from Thread");
        });
        myThread1.setName("Thread 1");

        Thread myThread2 = new Thread(() -> {
            System.out.println("Hi from Thread");
        });
        myThread2.setName("Thread 2");

        Thread[] threadList = new Thread[10];
        threadList[0] = myThread1;
        threadList[1] = myThread2;

        ThreadGroup group1 = new ThreadGroup("My ThreadGroup 1");
        group1.enumerate(threadList);
//        System.out.println("Active Count " + group1.activeCount());
//
//        myThread1.start();
//        myThread2.start();
//
//        System.out.println("Active Count " + group1.activeCount());

        group1.list();

        ThreadGroup group2 = new ThreadGroup("Group 2");

        MyThread t1 = new MyThread(group2,"T1");
        MyThread t2 = new MyThread(group2,"T2");
        MyThread t3 = new MyThread(group2,"T3");

        group2.setMaxPriority(4);

        // Executor Framework
    }

}

class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name){
        super(group, name);
    }


    public void run(){
        System.out.println("This is a thread " + getName());
    }
}