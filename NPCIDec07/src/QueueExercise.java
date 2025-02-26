import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Write a program to simulate a ticket counter using a Queue
 * where people are served in the order they arrive.
 * Add 5 people (e.g., names) to the queue and serve them one by one
 * by printing their names as they are served.
 */

public class QueueExercise {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new ArrayDeque<>();

        // Add 5 people to the queue
        ticketQueue.add("John");
        ticketQueue.add("Alice");
        ticketQueue.add("Bob");
        ticketQueue.add("Diana");
        ticketQueue.add("Eve");

        System.out.println("People in the ticket queue: " + ticketQueue);

        // Serve people one by one
        System.out.println("\nServing people:");
        while (!ticketQueue.isEmpty()) {
            // Remove the person served and print the name
            String person = ticketQueue.poll();
            System.out.println(person + " has been served.");
        }

        // Check if the queue is empty after serving
        if (ticketQueue.isEmpty()) {
            System.out.println("\nAll people have been served. The queue is now empty.");
        }

    }

    public static String serve(Queue<String> q){
        String servedTicketTo = q.remove();
        return servedTicketTo;
    }
}
