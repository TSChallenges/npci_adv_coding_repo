import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to create a List of students' names (e.g., ["John", "Alice", "Bob", "Alice", "Diana"]). Perform the following operations:
 *
 * Add a new name Eve to the list.
 * Print the total number of elements in the list.
 * Remove the first occurrence of the name Alice.
 * Print the final list of names.
 */

public class ListExercise {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Diana");

        //Add a new name Eve to the list.
        names.add("Eve");

        //Print the total number of elements in the list.
        System.out.println("Total Elements = " + names.size());

        //Remove the first occurrence of the name Alice.
        names.remove("Alice");

        //Print the final list of names.
        System.out.println("Final List = " + names);

        {
            MapDemo d = new MapDemo();
            MapDemo demo = // ask framework to give me the object
            //Inversion of Control - Dependency Injection Pattern

        }
    }


}
