package test;
// SharedResource class with a static variable for inter-thread communication
class SharedResource {
    public static int value = 0; // Shared static variable
    public static boolean valueProduced = false; // Flag to indicate whether value is produced
}

// Producer thread
class Producer extends Thread {
    @Override
    public void run() {
        int counter = 1; // Start producing numbers from 1
        while (true) {
            synchronized (SharedResource.class) {
                while (SharedResource.valueProduced) {
                    try {
                        SharedResource.class.wait(); // Wait if the value is not yet consumed
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                SharedResource.value = counter++;
                SharedResource.valueProduced = true;
                System.out.println("Producer produced: " + SharedResource.value);
                SharedResource.class.notify(); // Notify the consumer
            }

            try {
                Thread.sleep(500); // Simulate production delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (SharedResource.class) {
                while (!SharedResource.valueProduced) {
                    try {
                        SharedResource.class.wait(); // Wait if no value is produced
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println("Consumer consumed: " + SharedResource.value);
                SharedResource.valueProduced = false;
                SharedResource.class.notify(); // Notify the producer
            }

            try {
                Thread.sleep(500); // Simulate consumption delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

// Main class to start producer and consumer threads
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        producer.start();
        consumer.start();
    }
}
