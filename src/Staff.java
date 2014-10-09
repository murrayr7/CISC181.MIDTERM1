
public class Staff extends Employee{
	public Staff(String name, String address, double phoneNumber,
			String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
	}

	private String title;
	
	@Override
	public String toString(){
		return (this.getName()+"'s Title is a Staff Member");
	}

	public String getTitle() {
		return title;
	}
	
}
