package banking;

public abstract class BankAccount implements Account{

  double balance;
  protected String accHolderName;
  private String branch;

  public BankAccount(){
    this.branch = "TBD";
  }

  public BankAccount(String branch){
    this.branch = branch;
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


}
