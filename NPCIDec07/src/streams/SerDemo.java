package streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerDemo {
    public static void main(String[] args) throws Exception {

//        add(10,5);
        Employee emp1 = new Employee("Suresh", "EMP001", "Manager", 100.0);


        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Employee1.obj"));
        stream.writeObject(emp1);
        stream.close();

        //
        //

        emp1.getSalary();

    }

    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

}

// Marker Interface

class Employee implements Serializable {
    private String name;
    private String id;
    private String title;
    transient private double salary;
    private String address;

    private static final long serialVersionUID = 11L;

    public Employee(String name, String id, String title, double salary) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}