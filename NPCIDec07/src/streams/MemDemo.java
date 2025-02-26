package streams;

import java.util.ArrayList;
import java.util.List;

public class MemDemo {

    public static void main(String[] args) {


        int i  = 0;
        for (; i < 100; i++) {
            loadData();
            System.gc();
        }

        System.out.println("Done");



    }

    public static void loadData(){
        String str = "HEllo This is Memory Demo.................................";
        List<String > list = new ArrayList<>();
        for (int i = 0; i < 50000000; i++) {
            list.add(str + " " + i );
        }
        System.out.println("List size = " + list.size());
    }
}
