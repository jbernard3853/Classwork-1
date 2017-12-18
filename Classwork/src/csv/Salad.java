package csv;

public class Salad {
	private String name;
    private String price;
    
	public Salad(String name, String price) {
		this.name = name;
        this.price = price;	
       }

	@Override
	public String toString() {
		return "Salad [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
