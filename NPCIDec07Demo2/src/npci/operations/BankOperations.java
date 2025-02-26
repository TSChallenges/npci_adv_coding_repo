package npci.operations;

import npci.banking.*;

import java.util.function.Function;
import java.util.function.Predicate;

public class BankOperations{
  
   public static void main(String arg[]){

      SavingsAccount sAccount = new SavingsAccount("Hyd","ABC");
      sAccount.setBalance(100.0);

      CurrentAccount currentAccount = new CurrentAccount();
      currentAccount.setBalance(5000);

      NRIAccount nriAccount = new NRIAccount();
      nriAccount.setBalance(7777);

       BalancePrinter<SavingsAccount> balancePrinter = new BalancePrinter<>(sAccount);
       balancePrinter.printBalance();

       BalancePrinter<CurrentAccount> balancePrinter2 = new BalancePrinter<>(currentAccount);
       balancePrinter2.printBalance();

       BalancePrinter<NRIAccount> balancePrinter3 = new BalancePrinter<>(nriAccount);
       balancePrinter3.printBalance();


       Function<BankAccount,String> showDetails = bankAccount -> "This account Belongs to " + bankAccount.getAccHolderName();

       System.out.println(showDetails.apply(sAccount));

       Predicate<BankAccount> hasBalance = bankAccount -> bankAccount.getBalance() > 0;

       System.out.println("This accoutn has some balance : " + hasBalance.test(sAccount) );
   }

}


