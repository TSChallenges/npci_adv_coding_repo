import java.util.Scanner;

public class SwitchDemo{

    public static void main(String arg[]){

         // print day of the week given the number
         // 0 - Sun, 1- Mon .....

	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a Number : ");
        int dayNum  = scanner.nextInt();
	
	switch(dayNum){
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 0: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Number for the day");
	}
	System.out.println("Thank You!!");
    }

}