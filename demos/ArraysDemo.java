public class ArraysDemo{

	public static void main(String arg[]){

		// store multiple values of data

		int[] ages = new int[10];

		ages[0] = 12;
		ages[1] = 13;
		ages[2] = 10;
		ages[3] = 11;
		ages[4] = 11;
		ages[5] = 10;
		ages[6] = 13;
		ages[7] = 15;
		ages[8] = 12;
		ages[9] = 10;

		int[] numbers = {10,55,44,79,78,13};

		int v = ages[2];
		System.out.println("Number of students  = " + ages.length);
		

		// Find the average age of all the students.  Find the average of all the numbers in the array.

		int sum = 0;
		for (int i = 0; i < ages.length ; i++){
			sum = sum + ages[i];
		}
		double avg = sum / ages.length;
		System.out.println("Average = " + avg);


	}
}