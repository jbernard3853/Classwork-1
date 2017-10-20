package Person;

public abstract class Person {
	
	private String familyName;
	private String firstName;
	private int age;
	private String birthplace;
	
	public Person(String familyName, String firstName, int age, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.birthplace = birthplace;
	}
	
	public abstract String getGreeting();
	
	public int calculateAge() {
		System.out.println(age);
		return age;
	}
	
	public abstract String toString();
}

