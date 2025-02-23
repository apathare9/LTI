import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        
        // HashSet Init
        Set<Integer> set = new HashSet<Integer>();
        
        // add() elements
        set.add(1);
        set.add(2);
        set.add(3);
        
        // Print HashSet
        System.out.println(set);  // [1, 2, 3]
        
        // addAll() implementation of HashSet
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(set);
        
        System.out.println(set2); // [1, 2, 3]
        
        // iterator() implementation in HashSet
        Iterator<Integer> iterator = set2.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); // 1 2 3
        }
        
        // remove() implementation
        set2.remove(3);
        System.out.println(set2);  // [1, 2]
        
        //removeAll() implementation
        set.removeAll(set2);
        System.out.println(set);   // [3]
        System.out.println(set2);  // [1, 2]
        
        // retainAll() implementation 
        
        HashSet<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Cherry");
        
        HashSet<String> set4 = new HashSet<>();
        set4.add("Banana");
        set4.add("Cherry");
        set4.add("Date");
        
        // Retain only the elements in set1 that are also in set2
        set3.retainAll(set4);
        
        // Print the resulting set1
        System.out.println("Elements in set1 after retainAll(): " + set3); // Elements in set1 after retainAll(): [Cherry, Banana]
        
        // clear() implementation
        set3.clear();
        System.out.println(set3);
        
        // size();
        int size = set4.size();
        System.out.println(size);

 	 // contains()
        
        System.out.println(set2); // [1, 2]
        boolean val = set3.contains(2);
        System.out.println(val); // true
        
        
        
        
        
    }
    
}