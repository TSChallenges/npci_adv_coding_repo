import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        // Key value pair
        Map<String, String> studentGrades = new Hashtable<>();

        studentGrades.put("John","A");
        studentGrades.put("Dan","B");
        studentGrades.put("Eve","A");
        studentGrades.put("XYZ","B+");

        String value = studentGrades.get("Dan");
        System.out.println("Dan's grade is " + value);
        System.out.println("Size : " + studentGrades.size());

        studentGrades.put("Dan","A+");

        System.out.println("Size : " + studentGrades.size());

        Set<String> keySet =  studentGrades.keySet();
        Iterator<String> keysetIterator = keySet.iterator();
        while (keysetIterator.hasNext()){
            String key = keysetIterator.next();
            System.out.println(key + " = " + studentGrades.get(key));
        }


        StudentOperations studentOperations = new StudentOperations();
        studentOperations.addStudents("A",100);
        studentOperations.addStudents("B",90);

        studentGrades.forEach((k,v) -> System.out.println(k + " = " + v));

        System.out.println();
        studentGrades.forEach((k,v) -> {
            System.out.println(k + " = " + v);
            System.out.println("-------------");
        });

    }
}
