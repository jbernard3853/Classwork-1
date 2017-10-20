package Person;

public class Student extends Person{

	private String school;
	private double osis;
	private int gradelevel;
	private String classes;
	
	public Student(String familyName) {
		this.familyName = familyName;
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
