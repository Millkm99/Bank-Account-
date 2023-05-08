package Account;

import java.util.Scanner;


public class AccountTester {

public static void main(String [] args) {

AccountHolder acc_holder;
int acc_number;
Address address;

java.util.Random r=new java.util.Random();
String fName;
String lName;
String street;
String state;
String city;
long zip;
//*
Scanner s = new Scanner(System.in);
System.out.println("Enter first name");
fName=s.next();
System.out.println("Enter last name");
lName=s.next();
System.out.println("Street");
street=s.next();
System.out.println("City");
city=s.next();
System.out.println("State");
state=s.next();
System.out.println("Zip");
zip=s.nextLong();

//
acc_number=r.nextInt(99999);
address= new Address(street,zip,city,state);
acc_holder= new AccountHolder(fName,lName,address);
Account acc1 = new Account(acc_number,50.000,acc_holder);

acc_number=r.nextInt(88888);
address=new Address(street,zip,city,state);
acc_holder = new AccountHolder(fName,lName,address);
Account acc2 = new Account(acc_number,60.0000,acc_holder); 

acc_number=r.nextInt(77777);
address=new Address(street,zip,city,state);
acc_holder=new AccountHolder(fName,lName,address);
Account acc3 = new Account(acc_number,70.000,acc_holder);


      s.close();{
}
   }


Scanner sc=new Scanner(System.in);

private double balance;
private int acc_number;
private final double INTEREST_EARNING_RATE = 0.25;
private AccountHolder acc_holder;
{
SavingsAccount = new SavingsAccount(1000, 0.10);
account1.withdraw(50.000); {
account1.deposit(50.000); {
account1.addInterest(); {
System.out.println(TimSavings.getBalance()); {
System.out.println("Expected: 00.0000"); {
}
}
}

SavingsAccount = new SavingsAccount(1000, 0.10);
account2.withdraw(60.000); {
account2.deposit(60.000); {
account2.addInterest(); {
System.out.println(KateSavings.getBalance()); {
System.out.println("Expected: 00.0000"); {
}

SavingsAccount  = new SavingsAccount(1000, 0.10);
account3.withdraw(70.000); {
account3.deposit(70.000); {
account3.addInterest(); {
System.out.println(JimmysSavings.getBalance()); {
System.out.println("Expected: 00.0000"); {
}
   }
}
     }
}



