public class BankAccount {
    protected double balance;

    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initBalance)
    {
        balance = initBalance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double balance)
    {
        this.balance = this.balance-balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void addInterest(double rate)
    {
        balance = balance + ((balance*rate)/100);
    }
}