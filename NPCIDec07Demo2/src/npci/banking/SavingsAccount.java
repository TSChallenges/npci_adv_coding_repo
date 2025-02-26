package npci.banking;
public class SavingsAccount extends BankAccount{

    protected String details;

    public SavingsAccount(){
        System.out.println("Default Constructor in SavingsAccount Class");
    }

    public SavingsAccount(String branch, String name){
        super(branch);
        System.out.println("Parameterized Constructor in SavingsAccount Class");
        this.accHolderName = name;
        this.details = "Detailed policies of Savings Account";
    }

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


  public String getDetails(){
       this.printDetails();
       return super.details + " -- " + this.details;
  }

  // method overriding

    public void printDetails(){
       super.printDetails();
        System.out.println(this.details);
    }
}
