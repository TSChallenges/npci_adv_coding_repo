public class EnumsDemo {

    public static void main(String[] args) {

        System.out.println(Month.FEBRUARY);

        Month currentMonth = Month.JANUARY;

        Title title = Title.TA;

        String monthStr = "JUNE";

        Month month = Month.valueOf(monthStr);
        for (Month m :Month.values()){
            System.out.println(m);
        }

        switch (currentMonth){
            case JANUARY: System.out.println("Winter");
                            break;
            case FEBRUARY: System.out.println("Winter");
                break;
            case MARCH: System.out.println("Summer");
                break;

        }

//        calculateSalary("Januya");
        calculateSalary(Month.FEBRUARY);

        String m =Month.JANUARY.name();
        Month m1 = Month.valueOf("JULY");

    }

    public static void calculateSalary(Month month){

    }

//    public static void calculateSalary(String month){
//
//    }

}

// Fixed Constants
enum Month{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

enum Title{
    SE, SSE, TL, TA, MANAGER;
}