package decorator;

public class TestDecorator {
	public static void	test()
	{
		// Testing either milk or sugar coffee
		Coffe 			coffe1 			= new Coffe("Dark Latte Machiato", 7.);
		
		System.out.println("Coffe init");
		System.out.println("Coffee price: " + coffe1.getPrice() + " \t\tCoffe description: " + coffe1.getDescription());
		
		MilkDecorator	milkCoffe 		= new MilkDecorator(coffe1);
		System.out.println("Milk coffee price: " + milkCoffe.getPrice() + " \t\tCoffe description: " + milkCoffe.getDescription());
		
		SugarDecorator	sugarCoffe		= new SugarDecorator(coffe1);
		System.out.println("Sugar coffee price: " + sugarCoffe.getPrice() + " \t\tCoffe description: " + sugarCoffe.getDescription());


		// Testing coffee with milk and sugar
		Drink	coffe2			= new Coffe("Cappucino", 5.6);
		coffe2 = new MilkDecorator(coffe2);
		coffe2 = new SugarDecorator(coffe2);

		System.out.println("Sugar coffee price: " + coffe2.getPrice() + " \t\tCoffe description: " + coffe2.getDescription());


	}
}
