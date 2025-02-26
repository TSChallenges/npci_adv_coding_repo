import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> myQ = new PriorityQueue<>();

        //FIFO
        myQ.add("A");
        myQ.add("B");
        myQ.add("C");
        myQ.add("D");
        myQ.add("E");

        System.out.println(myQ);

        myQ.remove();
        System.out.println(myQ);

        System.out.println("peek " + myQ.peek());
        System.out.println(myQ);

        myQ.add("X");
        System.out.println(myQ);
    }

}
