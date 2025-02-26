import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Provide Length : ");
            int length = scanner.nextInt();
            System.out.print("Provide Breadth : ");
            int breadth = scanner.nextInt();

            System.out.println(Rectangle.shapeName);
            Rectangle r = new Rectangle(length, breadth);
            r.printArea();
            r.setLength(50);
            System.out.println(r.toString());
            System.out.println(r.getClass().getName());
            char c = 'x';
            int a = 10;
            int b = 2;

            double res = a / b;

            Rectangle r2 = null;
            r2.area();

            String name = "NPCI";
            name = "TalenSprint";
            System.out.println("Length = " + name.length());
            System.out.println("Upper case = " + name.toLowerCase());
            String newName = name.replace('I', 'D');
            System.out.println("replace = " + newName);
            System.out.println(name);




//            OutOfMemoryError

//            IOException







        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Rectanlge object not created..  skipping that and continue");
        }
        finally {
            System.out.println("This is code form finally block.....");
            System.out.println("Database connection closing here");
            //.....
        }

    }
}

// Access Specifiers
// default - within in package
// private - within the class
// protected - within the subclasses
// public - anywhere

