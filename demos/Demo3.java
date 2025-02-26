public class Demo3{



   // write a method to add two integers
   // it needs to take two integers as input, perform a + operation and return the result

   int add(int a, int b)
   {
      int sum = a + b;
      return sum;
   }

   // write a method to add three integers
   int add(int a, int b, int c)
   {
      int sum = a + b + c;
      return sum;
   }


   // write a method to add two double numbers
   double add(double a, double b)
   {
      double sum = a + b;
      return sum;
   }


   // write a method to add one integer and one double number
   double add(int a, double b)
   {
      double sum = a + b;
      return sum;
   }


   //  Method overloading - same method name and different no. of paramters or different type of parameters
   //  Method Overriding - Same method definition in parent class and Sub class - at run time based on the object type created,
       it picks the appropriate method for execution


   void sayHello(){
      System.out.println("Hello!!");
   }


    public static void main(String arg[]){
	Demo3 d = new Demo3();
	int result = d.add(5,3);
	System.out.println("Sum of two numbers is "+ result);

	int result2 = d.add(5,3,2);
	System.out.println("Sum of three numbers is "+ result2);


	double result3 = d.add(12.5f,3.5f);
	System.out.println("Sum of two numbers is "+ result3);

	double result4 = d.add(10,3.4f);
	System.out.println("Sum of two numbers is "+ result4);


        d.sayHello();
	
    }

}

// method - function, procedure - a block of code

// method takes zero or more arguments, executes the code block, optionally returns some value

// <access specifier> <return type> <method name> ( <list of arguments> )
// {
//    // code goes here
//    // return statement
// }