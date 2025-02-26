package streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

    public static void main(String[] args) throws Exception {

        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("Employee1.obj"));
        Object obj = stream.readObject();
        Employee emp = (Employee) obj;

        System.out.println("Name = " + emp.getName());
        System.out.println("ID = " + emp.getId());
        System.out.println("Title = " + emp.getTitle());
        System.out.println("Salary = " + emp.getSalary());
    }
}
