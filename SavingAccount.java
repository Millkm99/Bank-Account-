package Account;

public class SavingAccount extends Account {
private double balance;
private int acc_number;
private final double INTEREST_EARNING_RATE = 0.25;

public SavingAccount(int acc_number, double balance, AccountHolder acc_holder) {
	super(acc_number,balance,acc_holder);
	
}
public double getBalance() {
	return balance;
}
public long getAcc_number() {
	return acc_number;
}
public void deposit(double amount) {
	balance += amount;
}
public void withdraw (double amount) {
	balance = balance - amount;
}
public void addInterest () {
	balance = balance + balance * INTEREST_EARNING_RATE;
}
public void information ()  {
	System.out.println("This is a saving account with an interest earning rate of + INTEREST_EARNING_RATE");
}
}
 


