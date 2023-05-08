package Account;

public class AccountHolder {

private String fName;
private String lName; 
private Address address; 

public AccountHolder(String fName, String lName,Address address) { 
	this.fName=fName;
	this.lName=lName;
	this.address=address;
}
public String getName () {
	return fName +" "+ lName;
}
public String getFname () {
   return fName;
}
public String getLname() {
	return lName;
}
public void setlName (String lName) {
	this.lName = lName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address=address;
	
}
}
