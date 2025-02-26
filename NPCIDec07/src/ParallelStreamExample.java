import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            numbers.add(i);
        }

//        for (Integer i : numbers) {
//            System.out.println(i);
//        }

//        numbers.stream().forEach(i -> System.out.println(i));

        long st1 = System.currentTimeMillis();
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken to calculate sum = " + (end1 - st1) + " ms");

        long st2 = System.currentTimeMillis();
        sum = numbers.parallelStream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken to calculate sum = " + (end2 - st2) + " ms");
    }

}
