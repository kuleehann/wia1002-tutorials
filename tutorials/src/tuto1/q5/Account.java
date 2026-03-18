package tuto1.q5;

public interface Account { //everything should be public static final?
    public int test = 1; //it assumes it's a constant liao
    public int deposit(int amount);
    public boolean withdraw(int amount);
}
