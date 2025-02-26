package banking;
public abstract class CurrentAccount extends BankAccount{

  private String busDetails;

  // getter and setter methods
   public void setBusDetails(String busDetails){
       this.busDetails = busDetails;
   }
   public String getBusDetails(){
       return this.busDetails ;
   }


}

