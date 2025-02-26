import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpBenefitsProcessor {

    public static void main(String[] args) {

        Employee s1 = new Employee("Ramesh", 13, "SE", 95000);
        Employee s2 = new Employee("Suresh", 14, "SSE", 80000);
        Employee s3 = new Employee("John", 17, "TL", 50000);
        Employee s4 = new Employee("Priya", 11, "Manager", 100000);
        Employee s5 = new Employee("Santosh", 10, "TL", 65000);
        Employee s6 = new Employee("Eva", 13, "SE", 85000);

        List<Employee> employees = new ArrayList<>();
        employees.add(s1);
        employees.add(s2);
        employees.add(s3);
        employees.add(s4);
        employees.add(s5);
        employees.add(s6);

        /*
        Criteria
            1. by Title
            2. by Title and Salary - to calculate bonus
                For title just go by alphabetical comparison
                If two employees have different title compare only title and return
                If two employees have same title then compare salary
            3. by name
         */

        Comparator<Employee> sortByTitle = (e1,e2) ->{
            return e1.getTitle().compareTo(e2.getTitle());
        };

        Comparator<Employee> sortByTitleAndSalary = (e1,e2) ->{
            if (e1.getTitle().compareTo(e2.getTitle()) != 0){
                return e1.getTitle().compareTo(e2.getTitle());
            }else {
                return (int) (e1.getSalary() - e2.getSalary());
            }
        };

        Comparator<Employee> sortByName = (e1,e2) -> e1.getName().compareTo(e2.getName()) ;


        System.out.println("Sorted by Title");
        Collections.sort(employees,sortByTitle);
        employees.forEach(e  -> System.out.println(e));
        System.out.println();

        System.out.println("Sorted by Title and Salary");
        Collections.sort(employees,sortByTitleAndSalary);
        employees.forEach(e  -> System.out.println(e));
        System.out.println();

        System.out.println("Sorted by Name");
        Collections.sort(employees,sortByName);
        employees.forEach(e  -> System.out.println(e));

    }
}
