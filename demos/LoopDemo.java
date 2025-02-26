import java.util.Scanner;
public class LoopDemo{

	public static void main(String arg[]){

		// print numbers 1 to 10

		// for loop 
  		// while
		// do-while

/*
		for (int number = 0; number <10; number++){
			System.out.println(number);
		}
		System.out.println("Done");

		// print all odd numbers upto 20
		// 1,3,5....

		System.out.println("Below are odd numbers");
		for (int i = 1; i < 20; i = i+2){
			System.out.println(i);
		}
*/

		int num = 0;
		while (num < 10){
			Sytem.out.println(num);
			num++;
		}



		// Read numbers from user and add them up.  Stop if user gives 0;


/*		int sum = 0;
		System.out.println("Provide the numbers to add.  Enter '0' to stop.");
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("Enter a Number : ");
		        int num  = scanner.nextInt();
			if (num == 0){
				break;
			}
			sum = sum + num;
		}

		System.out.println("Total = " + sum);
*/

		// Read numbers from user and add them up.  Stop once the sum exceeds 100;


		int sum = 0;
		System.out.println("Provide the numbers to add.");
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("Enter a Number : ");
		        int num  = scanner.nextInt();
			sum = sum + num;
		} while(sum <= 100);

		System.out.println("Your numbers Sum crossed 100.  Sum= " + sum);

	}

}