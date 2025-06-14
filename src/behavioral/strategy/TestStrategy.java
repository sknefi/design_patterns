package strategy;

public class TestStrategy {
	public static void	test()
	{
		Payment payment = new Payment();

		payment.setStrategy(new Paypal());
		payment.pay(999);

		payment.setStrategy(new CreditCard());
		payment.pay(10);
	}
}
