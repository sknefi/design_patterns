package strategy;

public class Paypal implements PaymentStrategy {
	public void	pay(int amount)
	{
		System.out.println("Paypal: " + amount);
	}
}
