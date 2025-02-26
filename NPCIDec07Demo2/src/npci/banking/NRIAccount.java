package npci.banking;
public class NRIAccount extends BankAccount{

  private String currency;

  // getter and setter methods
   public void setCurrency(String currency){
       this.currency = currency;
   }
   public String getCurrency(){
       return this.currency;
   }

   public void setBalance(double balance){
	this.balance = balance;
  }

}