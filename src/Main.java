import singleton.TestSingleton;
import strategy.TestStrategy;
import adapter.TestAdapter;
import builder.TestBuilder;
import facade.TestFacede;
import factory.TestFactory;
import iterator.TestIterator;
import observer.TestObserver;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n=== Testing Singleton Pattern ===");
		TestSingleton.test();
		
		System.out.println("\n=== Testing Builder Pattern ===");
		TestBuilder.test();

		System.out.println("\n=== Testing Factory Pattern ===");
		TestFactory.test();

		System.out.println("\n=== Testing Observer Pattern ===");
		TestObserver.test();

		System.out.println("\n=== Testing Iterator Pattern ===");
		TestIterator.test();

		System.out.println("\n=== Testing Strategy Pattern ===");
		TestStrategy.test();

		System.out.println("\n=== Testing Adapter Pattern ===");
		TestAdapter.test();

		System.out.println("\n=== Testing Facede Pattern ===");
		TestFacede.test();

		System.out.println("\n");
	}
}