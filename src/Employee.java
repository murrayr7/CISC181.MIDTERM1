
public class Employee extends Person{
	public Employee(String name, String address, double phoneNumber,
			String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
		// TODO Auto-generated constructor stub
	}
	private String Office;
	private double Salary;
	private MyDate DateHired;
	public String getOffice() {
		return Office;
	}
	public double getSalary() {
		return Salary;
	}
	public MyDate getDateHired() {
		return DateHired;
	}
	
	
}
