package javainterview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("Apple", "Banana"),
            Arrays.asList("Orange", "Grapes"),
            Arrays.asList("Mango", "Papaya")
        );

        // Using map() → Returns Stream<List<String>>
        List<Stream<String>> mappedList = nestedList.stream()
            .map(List::stream)
            .collect(Collectors.toList());

        System.out.println("Using map(): " + mappedList); // Output: List of Streams

        // Using flatMap() → Returns Stream<String>
        List<String> flatMappedList = nestedList.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        System.out.println("Using flatMap(): " + flatMappedList); 
        // Output: [Apple, Banana, Orange, Grapes, Mango, Papaya]
    }
}
