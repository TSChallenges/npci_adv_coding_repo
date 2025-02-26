package npci.banking;

public class BalancePrinter<T extends BankAccount> {
    T account;
    public BalancePrinter(T account) {
        this.account = account;
    }
    public void printBalance(){
        System.out.println(account.getBalance());
    }
}
