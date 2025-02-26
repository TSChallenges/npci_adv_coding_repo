package threads.executor.demo;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorDemo3 {

    public static void main(String[] args) throws Exception{

        MyTask myTask = new MyTask();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> myTaskFuture = executorService.submit(myTask);

        System.out.println("Task Submitted");
        System.out.println("System is performing other activities...");

        System.out.println("Is the task complete : " + myTaskFuture.isDone() );
        Integer result = myTaskFuture.get();


//        System.out.println("Calling the task");
//        Integer result = myTask.call();
//        System.out.println("System is performing other activities...");
        System.out.println("Result = " + result);


    }
}


class MyTask implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}