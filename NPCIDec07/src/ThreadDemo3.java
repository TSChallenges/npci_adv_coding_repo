public class ThreadDemo3 {

    public static void main(String[] args) {

        PrintOddNumbers oddNumbers = new PrintOddNumbers("MyThread001");


        System.out.println("Thread Name :" + oddNumbers.getName());


        PrintEvenNumbers evenNumbers = new PrintEvenNumbers();
        Thread evenNumbersThread = new Thread(evenNumbers);


        Thread myThread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                if ( i % 3 == 0) {
                    System.out.println("Divisible by 3 : " +i);
                }
            }
        });

        oddNumbers.setPriority(1);
        evenNumbersThread.setPriority(10);

        oddNumbers.start();
        evenNumbersThread.start();
        myThread.start();

    }
}


class PrintOddNumbers extends Thread{

    public PrintOddNumbers(String name){
        super(name);
    }

    private void printNumbers(){
        for (int i = 0; i < 20; i++) {
            if ( i % 2 == 1) {
                System.out.println("Odd Number : " +i);
                try {
                    Thread.sleep(10,500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void run(){
        printNumbers();
    }
}

class PrintEvenNumbers implements Runnable{

    private void printNumbers(){
        for (int i = 0; i < 20; i++) {
            if ( i % 2 == 0) {
                System.out.println("Even Number : " + i);
            }
        }
    }
    @Override
    public void run() {
        printNumbers();
    }
}