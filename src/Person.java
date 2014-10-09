
public class Person {
	private String Name;
	private String Address;
	private double PhoneNumber;
	private String EmailAddress;
	
	
	public Person(String name, String address, double phoneNumber, String emailAddress) {
		Name = name;
		Address = address;
		PhoneNumber = phoneNumber;
		EmailAddress = emailAddress;
	}
	
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	public double getPhoneNumber() {
		return PhoneNumber;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	
	

}
