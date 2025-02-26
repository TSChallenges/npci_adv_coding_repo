import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Ramesh", 13, 95);
        Student s2 = new Student("Suresh", 14, 80);
        Student s3 = new Student("John", 17, 50);
        Student s4 = new Student("Priya", 11, 100);
        Student s5 = new Student("Santosh", 10, 65);
        Student s6 = new Student("Eva", 13, 85);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        Comparator<Student> byAge = (st1,st2) -> st1.getAge() - st2.getAge();
        Collections.sort(studentList,byAge);
        System.out.println("Students list sorted by Age");
        studentList.forEach(s -> System.out.println(s));


        Comparator<Student> byName = (st1,st2) -> st1.getName().compareTo(st2.getName());
        Collections.sort(studentList,byName);
        System.out.println("Students list sorted by Name");
        studentList.forEach(s -> System.out.println(s));

        Comparator<Student> byMarks = (st1,st2) -> st1.getTotalMarks() - st2.getTotalMarks();
        Collections.sort(studentList,byMarks);
        System.out.println("Students list sorted by Marks");
        studentList.forEach(s -> System.out.println(s));


    }

}
