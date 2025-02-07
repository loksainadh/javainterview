package javainterview;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumersuplier {
	
	    public static void main(String[] args) {
	        // Supplier Example: Supplies a string value
	        Supplier<String> supplier = () -> "Hello from Supplier!";
	        System.out.println(supplier.get());

	        // Consumer Example: Consumes a string and prints it
	        Consumer<String> consumer = i -> System.out.println("Consumer received: " + i);
	        consumer.accept(supplier.get());
	    }
	}


