import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {

//        String  names[] = new String[5]; // Arrays are of Fixed Length
//        names[0] = "Hyd";
//        names[1] = "Bangalore";
//        names[2] = "Pune";
//        names[3] = "Chennai";
//        names[4] = "Kolkata";
//        names[5] = "Delhi";
//        // remove one element from the array
//        names[2] = null;
//        //inserting a value

        List l = new ArrayList();
        l.add("s");
        l.add(new Rectangle(2,4));


        List<String> myList = new ArrayList<>();

        myList.add("Red");
        myList.add("Blue");
        myList.add("Green");
        myList.add("Orange");
        myList.add("Yellow");
        myList.add("Pink");
        myList.add("Magenta");
        myList.add(null);
        myList.add(null);
        myList.add(null);

        for (String ele : myList){
            System.out.println("Color---- " + ele);
        }

        System.out.println();
        myList.stream().forEach( c -> System.out.println("Color---- " +c));

        System.out.println();
        myList.stream().filter(c -> c!=null && c.length() > 4).forEach( s -> System.out.println(s));

        List<String> myColors =  myList.stream().filter(c -> c!=null && c.length() > 4).collect(Collectors.toList());

        System.out.println(myColors);

        myList.stream().forEach(c ->{
            //
            // save to DB
            //

        });



////        myList.add(500);
//
//        System.out.println("List: " + myList);
//
//        myList.remove("Blue");
//        System.out.println("After removing Blue -- List: " + myList);
//
//        myList.remove(4);
//        System.out.println("List: " + myList);
//
//        if ( myList.contains("Pink") ){
//            System.out.println("Yes, Orange is there");
//        }
//
//        myList.add("Orange");
//
//        myList.add(2,"Cyon");
//        System.out.println("List: " + myList);
//
//        myList.remove("Orange");
//        System.out.println("List after removing orange: " + myList);
//
//        ArrayList secondList = new ArrayList();
//        secondList.add("dark green");
//        secondList.add("sky blue");
//
//        myList.addAll(3,secondList);
//        System.out.println("List: " + myList);
//
//
//        System.out.println("Yellow is at : " + myList.indexOf("Yellow"));
//
//        List subList = myList.subList(3,6);
//        System.out.println("Sub list : " + subList);
//
//        System.out.println("For loop...............");
//        for (int i = 0; i<myList.size(); i++){
//            System.out.println("Color---- " + myList.get(i));
//        }
//
//        for (String ele : myList){
//            System.out.println("Color---- " + ele);
//        }
//
//
//        operateOnList(myList);
//
//
//        List<String> myList2 = new LinkedList<>();
//        operateOnList(myList2);

    }

    public static void operateOnList(List<String> list){
        list.get(0);
        list.add("aaa");
        list.remove("aaaaa");
    }
}
