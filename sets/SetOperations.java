import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // duplicate ignored
        
        System.out.println("Set: " + set);
        System.out.println("Contains banana: " + set.contains("banana"));
        set.remove("apple");
        System.out.println("After remove: " + set);
        
        // Sorted
        SortedSet<Integer> tree = new TreeSet<>();
        tree.add(3);
        tree.add(1);
        tree.add(3);
        System.out.println("TreeSet: " + tree);
    }
}

