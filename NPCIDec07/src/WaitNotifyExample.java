class SharedResource {
    private boolean ready = false;

    // Method to simulate a producer thread
    public synchronized void produce() {
        System.out.println("Producer: Starting production...");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ready = true;
        System.out.println("Producer: Production done. Notifying...");
        notify(); // Notify a waiting thread
    }

    // Method to simulate a consumer thread
    public synchronized void consume() {
        while (!ready) {
            try {
                System.out.println("Consumer: Waiting for production...");
                wait(); // Wait until notified
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer: Consumed the product!");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Consumer thread
        Thread consumer = new Thread(resource::consume);

        // Producer thread
        Thread producer = new Thread(resource::produce);

        consumer.start();
        producer.start();
    }
}
