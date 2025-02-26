import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StudentOperations {

    Map<String,Integer> students = Collections.synchronizedMap(new HashMap<>());

    public void addStudents(String studentName, Integer marks){
        students.put(studentName,marks);
    }

    public Integer getMarks(String studentName){
        return students.get(studentName);
    }

}
