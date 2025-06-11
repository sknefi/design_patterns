package singleton;

public class TestSingleton {
    public static void test() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Same instance ✅");
        } else {
            System.out.println("Different instances ❌");
        }
    }
} 