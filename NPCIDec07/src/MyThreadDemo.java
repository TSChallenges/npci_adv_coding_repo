import java.util.concurrent.*;

public class MyThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Message msg = new Message();
        Producer producer = new Producer(msg);
        Consumer consumer = new Consumer(msg);

        consumer.start();
        producer.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(consumer);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        scheduler.schedule(producer,2, TimeUnit.SECONDS);
    }
}

class Message{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


class Producer extends Thread{

    private final Message message ;

    public Producer(Message message) {
        this.message = message;
    }

    public void produce() {
        for (int i = 0; i < 10; i++) {
            synchronized(this.message) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                this.message.setMsg("Hello " + i);
                System.out.println("Produced Message : " + this.message.getMsg());
                this.message.notify();
                try {
                    this.message.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void run(){
         produce();
    }
}

class Consumer extends Thread{

    private final Message message ;

    public Consumer(Message message) {
        this.message = message;
    }

    public synchronized void consume() {
        while (true) {
           synchronized(this.message) {
                try {
                    if (this.message.getMsg() == null) {
                        System.out.println("Consumer: Waiting for production...");
                        this.message.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumed Message " + this.message.getMsg());
                this.message.setMsg(null);
                this.message.notify();
            }
        }
    }

    public void run(){
        consume();
    }
}
