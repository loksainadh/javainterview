package javainterview;
public class Main {
    public static void main(String[] args) {
        // You can create multiple instances because the constructor is not private
        A singleton1 = new A();  // Can instantiate directly
     // A singleton2 = new A();  // Can instantiate again
        //  System.out.println(singleton1 == singleton2);  // This will print 'false'
    }
}
