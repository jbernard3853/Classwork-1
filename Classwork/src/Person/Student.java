package Person;

public class Student extends Person{

	private String school;
	private double osis;
	private double gpa;
	private int gradeLevel;
	private String classes;
	
	public Student(String familyName, String firstName, String dob, int ssn, String school, double osis, double gpa, int gradeLevel) {
		super(familyName, firstName, dob, ssn);
		this.school = school;
		this.osis = osis;
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
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
