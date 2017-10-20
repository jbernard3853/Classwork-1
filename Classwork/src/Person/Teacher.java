package Person;

public class Teacher extends Person {
	private int salary;
	private String subject;
	private Student[][] classes;
	private String prefix;

	public Teacher(String familyName, String firstName, int age, String subject) {
		super(familyName,firstName,age,subject);
		this.subject = subject;
	}
	
	public String getGreeting()
	{
		System.out.println(this.familyName);
	}
    public String toString()
    {

		System.out.println(this.familyName);
	}
}
