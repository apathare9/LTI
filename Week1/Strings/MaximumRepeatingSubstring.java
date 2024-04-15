public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";

        int count = 0;
        String add = word;
        
        while(sequence.contains(word)) {
            count++;
            word = word + add; 
        }

        System.out.println(count);
        System.out.println(word);

    }
}