public class ArgsDemo{

	public static void main(String arg[]){
		System.out.println("No. of arguments passed " + arg.length);

		for (int i = 0; i < arg.length ; i++){
			System.out.println(i + " : " + arg[i]);
		}

		int v1 = Integer.parseInt(arg[0]);
		int v2 = Integer.parseInt(arg[1]);
		int sum = v1 + v2;
		System.out.println("Sum = " + sum);

	}
}