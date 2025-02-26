import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaDemo {

    public static void main(String[] args) {

        int a = 10;

        a = 20;

        List<String> names = new ArrayList<>();
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Ritesh");
        names.add("John");

        // print all values of the list
        for (String name: names){
            System.out.println(name);
        }
        System.out.println();
        // Lamda

        String var = "ABC";

        Function<String,String> addHi = name -> "Hi " + name;
        Function<String,String> addHello = name -> "Hello " + name;
        Function<String,String> addWelcome = name -> "Welcome " + name;

        String hiResponse = addHi.apply("Ramesh");
        System.out.println(hiResponse);


        System.out.println(addHello.apply("Ramesh"));
        System.out.println(addWelcome.apply("Ramesh"));




        System.out.println("____________________");


        names.forEach(name -> System.out.println(name));

        names.forEach(name -> {
            System.out.print("Name : ");
            System.out.println(name);
        });

        System.out.println("______________________________");

        Square sq = num -> num * num;

        int sqr = sq.calculate(5);
        System.out.println("Square of 5  = " + sqr);


    }
}
