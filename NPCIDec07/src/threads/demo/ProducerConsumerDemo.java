package threads.demo;

class SharedResource{
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class Producer extends Thread{

    SharedResource sharedResource;

    public Producer(SharedResource resource){
        this.sharedResource = resource;
    }

    private void produce(){
        for (int i = 1; i <= 10; i++) {
            synchronized (sharedResource) {
                System.out.println("<Producer> Produced : " + i);

                this.sharedResource.setNum(i);
                sharedResource.notify();
                try {
                    sharedResource.wait();
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

    SharedResource sharedResource;

    public Consumer(SharedResource resource){
        this.sharedResource = resource;
    }

    private void consume(){
        while(true){
            synchronized (sharedResource) {
                System.out.println("<Consumer> Waiting for Production");
                try {
                    sharedResource.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("<Consumer> Consumed " + sharedResource.getNum());
                sharedResource.notify();
            }
        }
    }

    public void run(){
        consume();
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        consumer.start();
        Thread.sleep(1000);
        producer.start();

    }
}
