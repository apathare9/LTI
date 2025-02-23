import java.util.LinkedHashSet;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        
        System.out.println(set); // [Apple, Banana, Cherry, Date]
        
        for(String e : set) {
            System.out.println(e); // Apple Banana Cherry Date
        }
        
        LinkedHashSet<String> set2 = new LinkedHashSet<String>();
        
        // addAll() implementation
        set2.addAll(set);
        System.out.println(set2); // [Apple, Banana, Cherry, Date]
        
        // remove() implementation
        set2.remove("Date");
        System.out.println(set2); // [Apple, Banana, Cherry]
        
        // removeAll() implementation
        set.removeAll(set2);
        System.out.println(set); // [Date]
        
        LinkedHashSet<String> set3 = new LinkedHashSet<>();
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Cherry");
        
        LinkedHashSet<String> set4 = new LinkedHashSet<>();
        set4.add("Banana");
        set4.add("Cherry");
        set4.add("Date");
        
        // retainAll()
        set3.retainAll(set4);
        System.out.println("Set 3 : " + set3); // Set 3 : [Banana, Cherry]
        System.out.println("Set 4 : " + set4); // Set 4 : [Banana, Cherry, Date]
        
        // clear()
        set3.clear();
        System.out.println(set3); // []
        
        // contains()
        System.out.println(set4);
        System.out.println(set4.contains("Banana"));
        
        
        

        
        
        
        
    }
    
}