import java.util.*;

public class HashCollisionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 31, 46, 61, 76, 91, 106);

        // HashMap to track hashCode to original numbers
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        for (Integer num : numbers) {
            int hash = Objects.hashCode(num) % 10; // Simple hash logic (mod 10 for collision demo)
            hashMap.computeIfAbsent(hash, k -> new ArrayList<>()).add(num);
        }

        // Print collisions
        System.out.println("Hash Collisions (no duplicates):");
        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
            List<Integer> collided = entry.getValue();
            if (collided.size() > 1) {
                // Use a Set to remove duplicates, just in case
                Set<Integer> uniqueCollisions = new HashSet<>(collided);
                System.out.println("Hash: " + entry.getKey() + " -> " + uniqueCollisions);
            }
        }
    }
}
