public class MutiThreadingDemo {

    public static void main(String[] args) throws InterruptedException {

        MyCalculator myCalculator1 = new MyCalculator("One");
        MyCalculator myCalculator2 = new MyCalculator("Two");
        MyCalculator myCalculator3 = new MyCalculator("Three");

        myCalculator1.start();
        myCalculator2.start();
        myCalculator3.start();
        System.out.println("All Threads started..........");

        myCalculator1.join();
        myCalculator2.join();
        myCalculator3.join();

        System.out.println("State of One " + myCalculator1.getState());
        System.out.println("State of Two " + myCalculator2.getState());
        System.out.println("State of Three " + myCalculator3.getState());

        System.out.println("Program Completed....");
    }
}


class MyCalculator extends Thread{

    private String name;

    public MyCalculator(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i=0; i<50; i++) {
            System.out.println(i + ". Hello from Calculator : " + name);
        }
        System.out.println("State="+this.getState());
    }
}