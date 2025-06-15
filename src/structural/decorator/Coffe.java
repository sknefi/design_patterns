package decorator;

public class Coffe implements Drink {
	private String	description = "Coffe:";
	private Double	price = 5.0;

	public	Coffe(String description, Double price)
	{
		this.description = description;
		this.price = price;
	}

	public Double	getPrice()
	{
		return (this.price);
	}

	public String	getDescription()
	{
		return (this.description);
	}
}
