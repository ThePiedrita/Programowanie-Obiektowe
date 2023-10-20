public class BankAccount {
    public double balance;

    public void deposit(double amount)
    {
        this.balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        this.balance = balance - amount;
    }
}
