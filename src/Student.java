
public class Student extends Person{
	private ClassStatus Status;
	
	@Override
	public String toString(){
		return (this.getName()+"'s Title is a Student");
	}

	public ClassStatus getStatus() {
		return Status;
	}

	public Student(String name, String address, double phoneNumber, String emailAddress, ClassStatus status) {
		super(name, address, phoneNumber, emailAddress);
		Status = status;
	}

}
