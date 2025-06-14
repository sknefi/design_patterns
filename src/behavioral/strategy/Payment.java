package strategy;

// This DP behaves almost like a factory, but it doesnt create anything, but it chooses
// the behavior of algorithm, in this case I was choosing between Paypal and CreditCard strategies
public class Payment {
	private PaymentStrategy	strategy;

	public void	setStrategy(PaymentStrategy strategy)
	{
		this.strategy = strategy;
	}

	public void	pay(int amount)
	{
		if (this.strategy == null)
		{
			System.out.println("No strategy speciefied for this payment!");
			return ;
		}
		this.strategy.pay(amount);
	}
}
