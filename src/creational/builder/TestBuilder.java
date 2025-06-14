package builder;

public class TestBuilder {
	public static void test() {
		String[] extras = {"Corn", "Chilly"};

		BuilderPizza pizza = new BuilderPizza.Builder()
			.addCheeseType("Goat cheese")
			.addCrusty(true)
			.addExtras(extras)
			.build();
		
		pizza.showPizza();
	}
} 