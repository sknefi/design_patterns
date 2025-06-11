import singleton.TestSingleton;
import builder.TestBuilder;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n=== Testing Singleton Pattern ===");
		TestSingleton.test();
		
		System.out.println("\n=== Testing Builder Pattern ===");
		TestBuilder.test();

		System.out.println("\n");
	}
} 