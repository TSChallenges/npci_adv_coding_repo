package test;

import java.util.ArrayList;
import java.util.List;

public class MemDemo {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
//
//        for (int i = 0; i < 100000000; i++) {
//            namesList.add("Hello " + i);
//        }

        System.out.println("List Size : " + namesList.size());

        recuTest();

    }


    public static void recuTest(){
        recuTest();
    }
}
