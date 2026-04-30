package hi.tuto.tuto1.q5;

public class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public boolean withdraw(int amount){
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        else return false;
    }

}
