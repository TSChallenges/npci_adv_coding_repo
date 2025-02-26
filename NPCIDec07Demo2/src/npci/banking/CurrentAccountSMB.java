package npci.banking;

class CurrentAccountSMB extends CurrentAccount{
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//  CurrentAccountSMB -> CurrentAccount --> BankAccount