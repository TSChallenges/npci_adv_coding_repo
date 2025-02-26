public class Employee {

    private String name;
    private int age;
    private String title;
    private double salary;

    public Employee(String name, int age, String title, double salary) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.salary = salary;
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

    public String toString(){
        return this.name + " ("+this.age+") : " + this.title + " - " + this.salary;
    }

}
