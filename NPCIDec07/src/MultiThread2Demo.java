public class MultiThread2Demo {

    public static void main(String[] args) throws Exception{

        MyCounter counter = new MyCounter();

        MyCounterThread c1 = new MyCounterThread(counter);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Counter Value = " + counter.getCount());
    }
}

class MyCounterThread implements Runnable{

    MyCounter counter;

    public MyCounterThread(MyCounter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            counter.increment();
        }
    }
}

class MyCounter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return this.count;
    }
}