package Account;

public class Address {

private String street;
private long zip;
private String city;
private String state;


public Address(String street, long zip, String city, String state) {
	this.street=street;
	this.zip=zip;
	this.city=city;
	this.state=state;
}


public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public long getZip() {
	return zip;

}

public void setZip(long z) {
	this.zip = zip;
}

public String getCity() {
	return city;
}

public void setCity(String c) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String s) {
	this.state = state;
}


}

