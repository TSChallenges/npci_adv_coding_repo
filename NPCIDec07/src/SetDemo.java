import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> cityNames = new TreeSet<>();

        cityNames.add("Delhi");
        cityNames.add("Bangalore");
        cityNames.add("Pune");
        cityNames.add("Chennai");
        cityNames.add("Delhi");
        cityNames.add("Kolkata");

        System.out.println("Size of the Set = " + cityNames.size());

        System.out.println("Set = " + cityNames);

        cityNames.add("Amritsar");
        cityNames.add("Mysore");

        System.out.println("Set = " + cityNames);


        workOnTheSet(cityNames);


    }


    public static void workOnTheSet(Set<String> set){
        // logic
    }

}
