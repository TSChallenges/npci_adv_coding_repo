import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmpMapDemo {
    public static void main(String[] args) {

//        add 10 employees to the map with repeated designations
        Map<String, String> employees = new HashMap<>();
        employees.put("Ramesh", "SE");
        employees.put("Suresh", "SSE");
        employees.put("Hitesh", "SE");
        employees.put("Ritesh", "QE");
        employees.put("Santosh", "TL");
        employees.put("Ram", "SSE");
        employees.put("John", "SSE");
        employees.put("Priya", "SSE");
        employees.put("Laxmi", "TL");
        employees.put("Soni", "SE");

//        print all the employees with their designations
        Iterator<String> itr = employees.keySet().iterator();
        while(itr.hasNext()){
            String key = itr.next();
            System.out.println(key + " : " + employees.get(key));
        }

//        print all employees whose designation is SE
        System.out.println("");
        System.out.println("Printing only SE");
        Iterator<String> itr2 = employees.keySet().iterator();
        while(itr2.hasNext()){
            String key = itr2.next();
            if(employees.get(key).equals("SE"))
                System.out.println(key + " : " + employees.get(key));
        }

//        Create another map with designations and count of how many employees with each designation in the above map.
        Map<String, Integer> desgCounts = new HashMap<>();
        Iterator<String> itr3 = employees.keySet().iterator();
        while(itr3.hasNext()){
            String empName = itr3.next();
            String desg = employees.get(empName);

            Integer count = desgCounts.get(desg);
            if (count == null ) {
                desgCounts.put(desg, 1);
            }else {
                desgCounts.put(desg, count + 1);
            }
        }
        System.out.println("Designations Count Map : " + desgCounts);
    }
}
