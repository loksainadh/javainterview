package javainterview;
public class A {
    // Instance of Singleton class (this will not be used in the right way)
    private static A instance;

    // Constructor is not private, so it can be instantiated directly
     private A() {
    }

    // Static method to get the instance (it doesn't control the instantiation anymore)
    public static A getInstance() {
        if (instance == null) {
            instance = new A();
        }
        return instance;
    }
}

// Usage
