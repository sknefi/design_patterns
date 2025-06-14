package strategy;

public class CreditCard implements PaymentStrategy {
	public void	pay(int amount)
	{
		System.out.println("Credit card: " + amount);
	}
}
