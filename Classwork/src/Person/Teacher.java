package Person;

public class Teacher extends Person {
	private int salary;
	private String subject;
	private Student[][] classes;
	private String prefix;

	public Teacher(String familyName, String firstName, String dob, int ssn, int salary, String subject, Student[][] classes, String prefix) {
		super(familyName, firstName, dob, ssn);
		this.salary = salary;
		this.subject = subject;
		this.classes = classes;
		this.prefix = prefix;
	}
	
	public String getGreeting()
	{
		return "I am" + this.firstName;
	}
	
    public String toString()
    {
		return "hi";
	}
}
