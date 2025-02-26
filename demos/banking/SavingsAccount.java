package banking;
public class SavingsAccount extends BankAccount{

   private boolean isSalaryAccount;

  // getter and setter methods
   public void setIsSalaryAccount(boolean isSalaryAccount){
       this.isSalaryAccount = isSalaryAccount;
   }
   public boolean getIsSalaryAccount(){
       return this.isSalaryAccount ;
   }
  
   public void setBalance(double balance){
        //  max amount limit check
        if (balance <= 100000)
		this.balance = balance;
  }

  public void displayDetails(){
     System.out.println("From SavingsAccount "+ accHolderName + " : " + balance );
  }


}
