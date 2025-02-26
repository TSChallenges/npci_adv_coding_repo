package test;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, Java IO!");
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student st = new Student("ABCD" , 15);

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.dat"));
        os.writeObject(st);
        System.out.println("Wrote object to file");
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("student.dat"));
        Student stu = (Student) is.readObject();
        System.out.println("Student name " + stu.getName());
        System.out.println("Student Age " + stu.getAge());



    }
}

class Student implements Serializable{
    private String name;
    transient private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
