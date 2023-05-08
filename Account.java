package Account;

public class Account {

private int acc_number; 
private double balance; 
private AccountHolder acc_holder;
private boolean hasSavingAcc;


public void getAccount (int acc_num , double balance) {
}
public Account (int acc_number ,double balance , AccountHolder acc_holder) {
	this.acc_number=acc_number;
	this.balance= balance;
	this.acc_holder= acc_holder;
	return;
	
}
public Account(String fName, String lName, Address address) {
	// TODO Auto-generated constructor stub
}
public int getaccNumber () {
	return acc_number;
}
public double getBalance () {
	return balance;
}
public AccountHolder getAccholder () {
	return acc_holder;
}
public void deposit (double amount) {
	balance += amount;
}
public void withdraw (double amount) {
	balance -= amount;
}
public boolean getHasSavingAcc () {
	return hasSavingAcc;
}

public void setHasSavingAcc (boolean hasSavingAcc, int SavingAcc)  {
this.hasSavingAcc = hasSavingAcc;
}
}





