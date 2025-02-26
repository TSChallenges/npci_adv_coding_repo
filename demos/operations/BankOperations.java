package operations;

import banking.*;

public class BankOperations{
  
   public static void main(String arg[]){

      SavingsAccount sAccount = new SavingsAccount();

      sAccount.setBalance(50000000.0);
      sAccount.setAccHolderName("ABC");
      //sAccount.setIsSalaryAccount(true);

	System.out.println("Name : " + sAccount.getAccHolderName());
	System.out.println("Balance : " + sAccount.getBalance());
	//System.out.println("Is Salary Account : " + sAccount.getIsSalaryAccount());

      sAccount.displayDetails();

      

      CurrentAccount cAccount = new CurrentAccount();
      cAccount.setBalance(50000000.0);
      cAccount.setAccHolderName("XYZ");
      //cAccount.setIsSalaryAccount(true);
      cAccount.setBusDetails("IT Company");

	System.out.println("Name : " + cAccount.getAccHolderName());
	System.out.println("Balance : " + cAccount.getBalance());
	System.out.println("Business Details : " + cAccount.getBusDetails());


	BankAccount account = new BankAccount();  // fails- compilation error


   }

}