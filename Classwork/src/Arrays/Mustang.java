package Arrays;

public class Mustang implements Horse {
	
	//fields
	private String name;
	private int weight;
	
	public Mustang(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

}
