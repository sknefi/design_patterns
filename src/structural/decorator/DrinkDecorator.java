package decorator;

public abstract class DrinkDecorator implements Drink {
	protected Drink	drink;

	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}

	public String	getDescription() {
		return (drink.getDescription());
	}

	public Double	getPrice() {
		return (drink.getPrice());
	}
}

