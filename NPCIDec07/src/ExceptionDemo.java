public class ExceptionDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        ExceptionDemo exceptionDemo = new ExceptionDemo();
        double r = exceptionDemo.divide(a,b);
        System.out.println("Result is " + r);

    }

    public double divide(int a, int b){
        double result = 0.0f;

        try {
            result = a / b;
        }catch(Exception ex){
            result = -1;
        }
        return result;
    }
}
