public class StringDemo {

    public static void main(String[] args) {
        String firstName = "Talent";
        String lsatName = new String("Sprint");

        // concatenation

//        String fullName = firstName.concat(lsatName);
        String fullName = firstName + lsatName;


        fullName = "Ms. " + firstName + " " + lsatName;
//        String salutation = "Ms.";
//        salutation += fullName  ;
//
//        System.out.println("Full Name = " + salutation);
//

        String str = "l";

//        System.out.println(fullName);
        char c = 't';

//        System.out.println(firstName.charAt(5));

//        System.out.println(fullName.indexOf(c));

//        System.out.println(fullName.lastIndexOf(c));
//
//        System.out.println(fullName.lastIndexOf("Spr"));
//
//        System.out.println(fullName.substring(4,10));


        // String Comparison

        int a = 10;
        int b = 11;

//        System.out.println(a == b);

        char c1 = 'x';
        char c2 = 'x';
        System.out.println(c1 == c2);


        String str1 = "Hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);

////
//        Rectangle r1 = new Rectangle(1,2);
//        Rectangle r2 = new Rectangle(1,2);
//
//        System.out.println(r1 == r2);
//        System.out.println(r1.equals(r2));

//        r2 = r1;
//        System.out.println(r1 == r2);

//        boolean res = str1.equals(str2);
//        System.out.println("Res = " + res);
//
//        System.out.println("Res case insensitive = " + str1.equalsIgnoreCase(str2));

        str1 = "Banana";
        str2 = "Apple";

        System.out.println(str1.compareTo(str2));

    }


}
