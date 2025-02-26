import java.util.ArrayList;

public class WrapperDemo {

    public static void main(String[] args) {

        // numeric, character, boolean

        ArrayList list = new ArrayList();
        list.add(10);

        byte b ;
        Byte bt;

        short s;
        Short st;

        int a = 10;
        Integer intg = a;  // Boxing...   value is kept in a Box (WrapperClass)

        int bbb = intg;  // UnBoxing..  value taken out from the box (wrapper class) and put into a primitive data type.


        System.out.println("Minimum Integer Value = " + Integer.MIN_VALUE);
        System.out.println("MAx Integer Value = " + Integer.MAX_VALUE);

        String someNum = "100";

        System.out.println(Integer.numberOfTrailingZeros(9000));

        int sno = Integer.parseInt(someNum);
        int mul = sno * 5;

        System.out.println(intg.doubleValue());

        long l;
        Long lg;

        float f;
        Float ft;

        double d;
        Double db;

        boolean bl;
        Boolean bln;

        char c;
        Character ch = 'a';

        String str = "";

        // Wrapper Class

        Byte bta;


        Integer abcd = 100;

        String str1 = abcd.toString();
        String str2 = Integer.toString(abcd);

        String str3 = "200";
        str3.charAt(0);
        str3.contains("0");


        Integer abc2 = 200;

        int i1 = (int) 2.5;








    }
}
