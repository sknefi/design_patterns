package singleton;

// Singleton allows us to have only one instance of object, if that instance was already created
// and we try to create another one, the first instance will be returned
public class Singleton {
	private static Singleton instance;

	private Singleton() {}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
} 