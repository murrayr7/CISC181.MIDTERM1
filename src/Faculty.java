
public class Faculty extends Employee{
	public Faculty(String name, String address, double phoneNumber,
			String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
	}

	private String OfficeHours;
	private String Rank;
	
	@Override
	public String toString(){
		return (this.getName()+"'s Title is a Faculty Member");
	}

	public String getOfficeHours() {
		return OfficeHours;
	}

	public String getRank() {
		return Rank;
	}
	

}
