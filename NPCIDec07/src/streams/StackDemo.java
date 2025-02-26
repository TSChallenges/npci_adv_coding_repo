package streams;

public class StackDemo {

    public static void main(String[] args) {
        int result = add(5,10);
    }


    public static int add(int a, int b){
        int sum = a + b;

        add(a,b);
        return sum;
    }
}
