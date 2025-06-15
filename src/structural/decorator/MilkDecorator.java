package decorator;

public class MilkDecorator extends DrinkDecorator {
	
	public	MilkDecorator(Drink drink)
	{
		super(drink);
	}

	public Double	getPrice()
	{
		return (super.getPrice() + 2.0);
	}

	public String	getDescription()
	{
		return (super.getDescription() + ", milk");
	}
}
