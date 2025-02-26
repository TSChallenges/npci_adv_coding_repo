package streams;

public class Demo1 {

    public static void main(String[] args) {

        Demo1 d = new Demo1();
        System.out.println("Start here");
        d.sayHello("ABCD");
        System.out.println("last line");
    }

    public String getData(){
        return "Some Data";
    }

    public String getNameWithData(String name){
            String data = getData();
            return name + data;
    }

    public void sayHello(String name){
        String result = getNameWithData(name);
        System.out.println(result);
    }

}
