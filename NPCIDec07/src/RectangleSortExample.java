import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RectangleSortExample {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5) ;
        Rectangle r2 = new Rectangle(20,5) ;
        Rectangle r3 = new Rectangle(30,15) ;
        Rectangle r4 = new Rectangle(10,2) ;
        Rectangle r5 = new Rectangle(5,3) ;

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(r1);
        rectangles.add(r2);
        rectangles.add(r3);
        rectangles.add(r4);
        rectangles.add(r5);


        System.out.println("Compare r1 and r2 " + r1.compareTo(r2));

        Collections.sort(rectangles);

        rectangles.forEach(r ->{
            r.printDetails();
        });


    }
}
