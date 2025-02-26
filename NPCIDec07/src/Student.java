public class Student {

    private String name;
    private int age;
    private int totalMarks;

    public Student(String name, int age, int totalMarks) {
        this.name = name;
        this.age = age;
        this.totalMarks = totalMarks;
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

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String toString(){
        return this.name + " ["+this.age+"] - "+this.totalMarks;
    }
}
