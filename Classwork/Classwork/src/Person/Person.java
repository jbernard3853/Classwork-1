package Person;
import java.util.Date;

public abstract class Person {
	protected String firstName;
	protected String familyName;
	protected String dob;
	protected int ssn;
	
	public Person(String familyName, String firstName, String dob, int ssn) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.dob = dob;
		this.ssn = ssn;
	}
	
	public abstract String getGreeting();
	
	public int calculateAge() {
		Date date = new Date();
		System.out.println(dob);
		return 0;
	}
	
	public String toString() {
		return this.firstName + this.familyName;
	}
	
}

