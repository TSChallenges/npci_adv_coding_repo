package npci.banking;

public abstract class BankAccount implements Account{

  protected String details;
  double balance;
  protected String accHolderName;
  protected String branch;

  public BankAccount(){
    System.out.println("Default Constructor in BankAccount Class");
    this.branch = "TBD";
  }

  public BankAccount(String branch){
    System.out.println("Parameterized Constructor in BankAccount Class");
    this.branch = "BR_"+branch;
    this.details = "Initial Account Details here....";
  }

  public double getBalance(){
	return this.balance;
  }

  public abstract void setBalance(double balance);

  public String getAccHolderName(){
	return this.accHolderName;
  }

  public void setAccHolderName(String accHolderName){
	this.accHolderName = accHolderName;
  }

  public void displayDetails(){
     System.out.println("From BankAccount "+accHolderName + " : " + balance);
  }

  public void printDetails(){
    System.out.println(this.details);
  }

}
