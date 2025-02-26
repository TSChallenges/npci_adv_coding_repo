package threads.demo2;

import java.util.ArrayList;
import java.util.List;

class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

enum Cities{
    Hyderabad, Chennai, Bangalore, Pune, Delhi, Kolkata, Mysore, Kochi;
}

class Producer extends Thread{

    List<String> list = new ArrayList<>();
    Message message;

    public Producer(Message message) {
        this.message = message;
    }

    public void produce(){
        for(Cities name : Cities.values()){
            synchronized (message) {
                System.out.println("Produced message - 'Hi from "+name+"'");
                message.setMessage("Hi from " + name);
                message.notify();
                try {
                    message.wait();
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

    Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public void consume(){
        while (true){
            synchronized (message) {
                try {
                    System.out.println("Waiting for producer to produce the message");
                    message.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumed Message : " + message.getMessage());
                message.notify();
            }
        }
    }

    public void run(){
        consume();
    }
}

public class CityNamesProducerConsumer {

    public static void main(String[] args) {
        Message message = new Message();


        Producer producer = new Producer(message);
        Consumer consumer = new Consumer(message);

        consumer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        producer.start();

    }
}
