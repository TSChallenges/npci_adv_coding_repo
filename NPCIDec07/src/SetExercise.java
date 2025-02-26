import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to create a Set of unique integers. Add the following numbers: 10, 20, 30, 20, 40, 50. Perform the following operations:
 *
 * Print the size of the set.
 * Check if the number 20 exists in the set.
 * Remove the number 30 from the set.
 * Print all the elements in the set.
 */
public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> setOfNumbers = new HashSet<>();

        setOfNumbers.add(10);
        setOfNumbers.add(20);
        setOfNumbers.add(30);
        setOfNumbers.add(40);
        setOfNumbers.add(50);

//        Print the size of the set.
        System.out.println("Size of the set : " + setOfNumbers.size());

//        Check if the number 20 exists in the set.
        System.out.println("number 20 exists : " + setOfNumbers.contains(20));

//        Remove the number 30 from the set.
        setOfNumbers.remove(30);

//        Print all the elements in the set.
        System.out.println("Set = " + setOfNumbers);

    }
}
