package decorator;

public class SugarDecorator extends DrinkDecorator {
	
	public SugarDecorator(Drink drink)
	{
		super(drink);
	}

	public Double	getPrice()
	{
		return (super.getPrice() + 0.7);
	}

	public String	getDescription()
	{
		return (super.getDescription() + ", sugar");
	}
}
